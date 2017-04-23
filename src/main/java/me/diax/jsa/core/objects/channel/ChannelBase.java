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

import me.diax.jsa.core.Skype;
import me.diax.jsa.core.objects.message.Message;
import me.diax.jsa.core.objects.user.User;

import java.util.Map;
import java.util.TreeSet;

/**
 * Created by Comportment on 22/04/17.
 *
 * CAN YOU HEAR ME?
 */
public interface ChannelBase {

    /**
     * Sends a string message to the channel.
     *
     * @param message The message to send.
     */
    void sendMessage(String message);

    /**
     * Sends a {@link Message} to the channel.
     *
     * @param message The {@link Message to send}
     */
    void sendMessage(Message message);

    /**
     * Sets if alerts should be on.
     *
     * @param on True to turn the alerts on, false to turn the alerts off.
     */
    void setAlerts(boolean on);

    /**
     * Sets if you should get an alert from a keyword spoken in chat.
     *
     * @param keyword The keyword to get alerts for.
     */
    void alertOn(String keyword);

    /**
     * Gets yourself.
     *
     * @return The {@link User} which represents yourself in the channel.
     */
    User getSelfUser();

    /**
     * Gets the client linked to this channel.
     *
     * @return The {@link Skype} client linked to the channel.
     */
    Skype getClient();

    /**
     * Gets the unique identifier for the channel.
     *
     * @return The identifier for the channel.
     */
    String getIdentifier();

    /**
     * Gets the users participating in this channel.
     *
     * @return A {@link Map} containing the users and their names.
     */
    Map<String, User> getUsers();

    /**
     * Gets a user from their name.
     *
     * @param name The name of the user to get.
     * @return The {@link User} that was found, possibly <code>null</code>
     */
    User getUser(String name);

    /**
     * Gets the messages in the channel.
     *
     * @return A {@link TreeSet} containing the messages ordered by the timestamp they were sent at.
     */
    TreeSet<Message> getMessages();

    /**
     * @param amount The amount of messages to retrieve.
     * @return A {@link TreeSet} containing the
     */
    TreeSet<Message> getMessageHistory(int amount);
}