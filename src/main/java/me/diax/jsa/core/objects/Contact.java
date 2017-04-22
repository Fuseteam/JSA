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

package me.diax.jsa.core.objects;

import me.diax.jsa.core.enums.Status;

/**
 * Created by Comportment on 22/04/17.
 *
 * My name is badi, but you can call me anytime.
 */
public interface Contact {

    String getFirstName();

    String getLastName();

    String getUsername();

    String getDisplayName();

    String getAvatarUrl();

    String getMoodMessage();

    String getCountry();

    String getCity();

    Status getStatus();

    boolean isBlocked();

    boolean isFriend();

    Contact block();

    Contact blockAndReportAbuse();

    Contact unblock();
}