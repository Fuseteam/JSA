/*
 * Copyright 2017 Comportment
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.diax.jsa.bot;

import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.request.Request;
import me.diax.jsa.core.request.Requests;

/**
 * Created by Comportment on 22/04/17.
 *
 * Beep boop!
 */
public class SkypeBot extends SkypeImpl {

	private String token;
	
    public SkypeBot(String username, String password) {
        super(username, password);
    }

    @Override
    public SkypeBot login() {
        //TODO: login
    	Request request = Requests.getToken.body("grant_type=client_credentials&client_id=" + getUsername() + "&client_secret=" + getPassword() + "&scope=https%3A%2F%2Fgraph.microsoft.com%2F.default");
    	getDispatcher().dispatch(request).handle(success -> {
    		if(success.getStatus() == 200) {
        		token = success.getBody().getObject().getString("access_token");
        		System.out.println(token);
    		} else {
    			System.out.println(success.getBody());
    		}
    	}, failure -> {
    		System.out.println(failure.getMessage());
    	});
        return this;
    }

    @Override
    public SkypeBot logout() {
        //TODO: Logout
        return this;
    }
}
