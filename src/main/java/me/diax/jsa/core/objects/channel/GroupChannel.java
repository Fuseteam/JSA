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

import me.diax.jsa.core.objects.contact.Contact;
import me.diax.jsa.core.objects.user.User;

import java.util.List;

/**
 * Created by Comportment on 23/04/17.
 *
 * What team?! WILDCATS!
 */
public interface GroupChannel extends ChannelBase {

    /**
     * Gets all of the admins in the group.
     *
     * @return A {@link List} containing the admins of the group.
     */
    List<User> getAdmins();

    /**
     * Gets the topic of the channel.
     *
     * @return A string containing the topic of the channel.
     */
    String getTopic();

    /**
     * Sets the topic of the channel.
     *
     * @param topic The topic to set.
     */
    void setTopic(String topic);

    /**
     * Gets the join url of the channel.
     *
     * @return A string containing the join url of the channel, could be <code>null</code>
     */
    String getJoinUrl();

    /**
     * Gets the image url of the channel.
     *
     * @return A string containing the URL of the channel's image, code be <code>null</code>
     */
    String getImage();

    /**
     * Sets the image of the channel.
     *
     * @param image The direct URL of the image to set.
     */
    void setImage(String image);

    /**
     * Makes the {@link me.diax.jsa.core.Skype} leave the channel.
     */
    void leave();

    /**
     * Adds multiple contacts to the channel.
     *
     * @param contact  The first {@link Contact} to add.
     * @param contacts The rest of the {@link Contact}s to add.
     */
    void addContacts(Contact contact, Contact... contacts);

    /**
     * Adds a single contact to the channel.
     *
     * @param contact The {@link Contact} to add to the channel.
     */
    void addContact(Contact contact);
}