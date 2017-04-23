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

import java.util.List;
import java.util.Map;

/**
 * Created by Comportment on 22/04/17.
 *
 * CAN YOU HEAR ME?
 */
public interface ChannelBase {

    void sendMessage(String message);

    void sendMessage(Message message);

    void setAlerts(boolean on);

    void alertOn(String keyword);

    User getSelfUser();

    Skype getClient();

    String getIdentifier();

    Map<String, User> getUsers();

    User getUser(String name);
}