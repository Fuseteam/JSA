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
import me.diax.jsa.core.exceptions.LoginException;
import me.diax.jsa.core.request.Dispatcher;

/**
 * Created by Comportment on 22/04/17.
 *
 * First!
 */
public interface Skype {

    /**
     *
     * @return The {@link Status} of the client.
     */
    Status getStatus();

    /**
     * Sets the status of the client.
     *
     * @param status Sets the {@link Status} of the client.
     * @return An instance of this, useful for chaining.
     */
    Skype setStatus(Status status);

    /**
     * @return The mood message of the client.
     */
    String getMoodMessage();

    /**
     * Sets the mood message of the client.
     *
     * @param moodMessage The mood message to set.
     * @return An instance of this, useful for chaining.
     */
    Skype setMoodMessage(String moodMessage);

    /**
     *
     * @return The username of the client.
     */
    String getUsername();

    /**
     * Tries to login to Skype [called when a {@link SkypeBuilder} is built]
     *
     * @return An instance of this, useful for chaining.
     */
    Skype login() throws LoginException;

    /**
     * Logs out of Skype.
     *
     * @return An instance of this, useful for chaining.
     */
    Skype logout();

    /**
     *
     * @return The dispatcher linked to this client.
     */
    Dispatcher getDispatcher();
}