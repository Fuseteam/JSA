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
import me.diax.jsa.core.enums.Role;
import me.diax.jsa.core.objects.contact.Contact;
import me.diax.jsa.core.objects.message.Message;
import me.diax.jsa.core.objects.user.User;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by Comportment on 23/04/17.
 *
 * 2 days in, woooop!
 */
public class GroupChannelImpl extends ChannelImpl implements GroupChannel {

    private String topic;
    private String image;
    private String joinUrl;


    public GroupChannelImpl(SkypeImpl client, String identifier) {
        super(client, identifier);
        load();
    }

    @Override
    protected void load() {
        this.topic = "topic";
        this.image = "image";
        this.joinUrl = "joinurl";
        this.users = null;
        //TODO: WS stuff
    }

    @Override
    public List<User> getAdmins() {
        return getUsers().values().stream().filter(user -> user.getRole().equals(Role.ADMIN)).collect(Collectors.toList());
    }

    @Override
    public TreeSet<Message> getMessageHistory(int amount) {
        return null; //TODO: WS stuff
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic; //TODO: WS stuff
    }

    @Override
    public String getJoinUrl() {
        return joinUrl; //TODO:ws stuff
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public void setImage(String image) {
        this.image = image; //TODO: WS stuff
    }

    @Override
    public void leave() {
        //TODO: WS stuff
    }

    @Override
    public void addContacts(Contact contact, Contact... contacts) {
        List<Contact> contactList = Arrays.asList(contacts);
        contactList.add(contact);
        //TODO: WS stuff contactList.forEach(c -> c);
    }

    @Override
    public void addContact(Contact contact) {
        addContacts(contact);
    }
}