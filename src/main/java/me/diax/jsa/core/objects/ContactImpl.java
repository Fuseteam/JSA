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

package me.diax.jsa.core.objects;

import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.enums.Status;

/**
 * Created by Comportment on 22/04/17.
 *
 * What's a friend?
 */
public class ContactImpl implements Contact {

    private SkypeImpl skype;
    private String firstName;
    private String lastName;
    private String username;
    private String displayname;
    private String avatarUrl;
    private String moodMessage;
    private String country;
    private String city;
    private Status status;
    private boolean isBlocked;
    private boolean isFriend;

    public ContactImpl(SkypeImpl skype, String username) {
        this.skype = skype;
        this.username = username;
        //TODO: Contact WS and get other fields;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getDisplayName() {
        return displayname;
    }

    @Override
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @Override
    public String getMoodMessage() {
        return moodMessage;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public boolean isBlocked() {
        return isBlocked;
    }

    @Override
    public boolean isFriend() {
        return isFriend;
    }

    @Override
    public Contact block() {
        if (isBlocked) throw new IllegalArgumentException("Contact is already blocked.");
        isBlocked = true; //TODO: Contact WS and block.
        return this;
    }

    @Override
    public Contact blockAndReportAbuse() {
        if (isBlocked) throw new IllegalArgumentException("Contact is already blocked.");
        isBlocked = true; //TODO: Contact WS
        return this;
    }

    @Override
    public Contact unblock() {
        if (!isBlocked) throw new IllegalArgumentException("Contact is not blocked.");
        isBlocked = false; //TODO: Contact WS
        return this;
    }
}
