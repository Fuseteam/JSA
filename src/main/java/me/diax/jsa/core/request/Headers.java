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

package me.diax.jsa.core.request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Felix Vogel on 22/04/17
 * 
 * The class representing http/https Header
 */
public class Headers {

	protected final Map<String, String> map;
	
	public Headers() {
		map = new HashMap<>();
	}
	
	public Headers add(String key, String value) {
		map.put(key, value);
		return this;
	}
}