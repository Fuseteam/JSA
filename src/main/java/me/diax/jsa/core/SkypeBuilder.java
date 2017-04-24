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

import me.diax.jsa.bot.SkypeBot;
import me.diax.jsa.core.enums.AccountType;
import me.diax.jsa.user.SkypeUser;

/**
 * Created by Comportment on 22/04/17.
 *
 * DXXX.com >_<
 */
public class SkypeBuilder {

    private final AccountType type;

    private String username;
    private String password;

    /**
     * Constructor to set the account type.
     *
     * @param type The {@link AccountType} of the account.
     */
    public SkypeBuilder(AccountType type) {
        if (!type.equals(AccountType.BOT)) {
            throw new UnsupportedOperationException("Support for this account type has not been implemented yet.");
        }
        this.type = type;
    }

    /**
     * Method that sets the username and password.
     *
     * @param username The login username to set.
     * @param password The password to set.
     * @return An instance of this, useful for chaining.
     */
    public SkypeBuilder setCredentials(String username, String password) {
        return setUsername(username).setPassword(password);
    }

    /**
     * Method that sets the username.
     *
     * @param username The username to set.
     * @return An instance of this, useful for chaining.
     */
    public SkypeBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Method that sets the password.
     *
     * @param password The password to set.
     * @return An instance of this, useful for chaining.
     */
    public SkypeBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Builds the object and returns a {@link Skype} object.
     *
     * @return A {@link Skype} object using the values set.
     */
    public Skype build() {
        switch (type) {
            case BOT:
                return new SkypeBot(username, password).login();
            case USER:
                return new SkypeUser(username, password).login();
            default:
                throw new IllegalStateException("AccountType not specified.");
        }
    }
}
