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

package me.diax.jsa.core;

import me.diax.jsa.core.enums.Status;
import me.diax.jsa.core.request.Dispatcher;
import me.diax.jsa.core.request.Request;
import me.diax.jsa.core.request.Requests;

/**
 * Created by Comportment on 22/04/17.
 *
 * This file structure is starting to look copied from somewhere
 * <br>
 * But where? owo
 */
public abstract class SkypeImpl implements Skype {

    private final String username;
    private String moodMessage;
    private Status status;
    private Dispatcher dispatcher;
    private final Request request;

    public SkypeImpl(String username, String password) {
        this.username = username;
        request = Requests.getToken.body("grant_type=client_credentials&client_id=" + username + "&client_secret=" + password + "&scope=https%3A%2F%2Fgraph.microsoft.com%2F.default");
        dispatcher = new Dispatcher();
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public Skype setStatus(Status status) {
        this.status = status;
        return this;
    }

    @Override
    public Skype setMoodMessage(String moodMessage) {
        if (moodMessage.length() > 200) throw new IllegalArgumentException("Mood message must be 200 or less characters long.");
        this.moodMessage = moodMessage;
        return this;
    }

    @Override
    public String getMoodMessage() {
        return moodMessage;
    }
    
    @Override
    public Dispatcher getDispatcher() {
    	return dispatcher;
    }
    
    public Request getRequest() {
    	return request;
    }
}