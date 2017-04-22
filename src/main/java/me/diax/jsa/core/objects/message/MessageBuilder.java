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

import java.sql.Timestamp;

/**
 * Created by Comportment on 22/04/17.
 *
 * Comportment'll build it!
 */
public class MessageBuilder {

    private String content;

    /**
     *
     * @param content The content to set of the message.
     * @return The instance of this, useful for chaining.
     */
    public MessageBuilder setContent(String content) {
        if (content.length() > 7990) throw new IllegalArgumentException("The message content can not be longer than 7790 characters long.");
        this.content = content;
        return this;
    }

    /**
     *
     * @return A {@link Message} built with all the fields.
     */
    public Message build() {
        if (content == null) throw new NullPointerException("Content can not be null!");
        return new MessageImpl(
                content,
                null,
                null,
                new Timestamp(System.currentTimeMillis() * 1000),
                null,
                null,
                null);
    }
}
