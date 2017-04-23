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

package me.diax.jsa.user;

import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.request.Request;
import me.diax.jsa.core.request.Requests;

/**
 * Created by Comportment on 22/04/17.
 *
 * I fight for the Users!
 */
public class SkypeUser extends SkypeImpl {

    private String password;
    private final Request request;

    public SkypeUser(String username, String password) {
        super(username);
        this.request = Requests.getToken.body("&scope=client"); //TODO: Stuff
    }

    @Override
    public SkypeUser login() {
        //TODO: Stuff
        return this;
    }

    public SkypeUser logout() {
        //TODO: Stuff
        return this;
    }
}