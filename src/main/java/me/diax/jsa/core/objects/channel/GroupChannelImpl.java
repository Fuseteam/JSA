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

package me.diax.jsa.core.objects.channel;

import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.objects.contact.Contact;
import me.diax.jsa.core.objects.message.Message;
import me.diax.jsa.core.objects.user.User;

import java.util.List;
import java.util.TreeSet;

/**
 * Created by Comportment on 23/04/17.
 *
 * 2 days in, woooop!
 */
public class GroupChannelImpl extends ChannelImpl implements GroupChannel {

    private String topic;
    private String image;

    public GroupChannelImpl(SkypeImpl client, String identifier) {
        super(client, identifier);
    }

    @Override
    public List<User> getAdmins() {
        return null;
    }

    @Override
    public TreeSet<Message> getMessages() {
        return null;
    }

    @Override
    public TreeSet<Message> getMessageHistory(int amount) {
        return null;
    }

    @Override
    public String getTopic() {
        return null;
    }

    @Override
    public String getJoinUrl() {
        return null;
    }

    @Override
    public void setTopic(String topic) {

    }

    @Override
    public void setImage() {

    }

    @Override
    public void leave() {

    }

    @Override
    public void addUsers(Contact... contact) {

    }

    @Override
    public void addUser(Contact contact) {

    }
}