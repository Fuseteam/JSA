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

package me.diax.jsa.core.objects.message;

import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.objects.user.User;
import me.diax.jsa.core.objects.channel.ChannelBase;

import java.sql.Timestamp;

/**
 * Created by Comportment on 22/04/17.
 *
 * \o/ updates are fun, now we just the actual websocket stuff done.
 */
public class MessageImpl implements Message {

    private String content;
    private String clientId;
    private String id;
    private Timestamp timestamp;
    private User sender;
    private ChannelBase channel;
    private SkypeImpl skype;

    public MessageImpl(String content, String clientId, String id, Timestamp timestamp, User sender, ChannelBase channel, SkypeImpl skype) {
        this.content = content;
        this.clientId = clientId;
        this.id = id;
        this.timestamp = timestamp;
        this.sender = sender;
        this.channel = channel;
        this.skype = skype;
    }

    @Override
    public String getRawContent() {
        return content;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public ChannelBase getChannel() {
        return channel;
    }

    @Override
    public void setRawContent(String content) {
        this.content = content;
    }

    @Override
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int compareTo(Message that) {
        return this.getTimestamp().compareTo(that.getTimestamp());
    }
}