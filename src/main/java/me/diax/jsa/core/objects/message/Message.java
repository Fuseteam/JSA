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

import me.diax.jsa.core.objects.user.User;
import me.diax.jsa.core.objects.channel.MessageChannel;

import java.sql.Timestamp;

/**
 * Created by Comportment on 22/04/17.
 *
 * message massage
 */
public interface Message {

    /**
     *
     * @return The raw content of the message.
     */
    String getRawContent();

    /**
     * Sets the raw content of the message.
     *
     * @param content The content to set.
     * @return An instance of this, useful for chaining.
     */
    Message setRawContent(String content);

    /**
     *
     * @return The id assigned to the message by the client.
     */
    String getClientId();

    /**
     *
     * @return The unique id of the message assigned by Skype.
     */
    String getId();

    /**
     *
     * @return Gets the timestamp the message was sent at.
     */
    Timestamp getTimestamp();

    /**
     *
     * @param timestamp Sets the timestamp of the message.
     * @return An instance of this, useful for chaining.
     */
    Message setTimestamp(Timestamp timestamp);

    /**
     *
     * @return The author of the message.
     */
    User getSender();

    /**
     *
     * @return The channel the message was sent in.
     */
    MessageChannel getChannel();
}