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
import me.diax.jsa.core.objects.user.User;

/**
 * Created by Comportment on 23/04/17.
 *
 * Time to get private
 */
public class PrivateChannelImpl extends ChannelImpl implements PrivateChannel {

    public PrivateChannelImpl(SkypeImpl client, String identifier) {
        super(client, identifier);
        load();
    }

    @Override
    public User getOtherUser() {
        return getUsers().remove(getClient().getUsername());
    }

    @Override
    protected void load() {
        this.users = null; //TODO: WS stuff
    }
}