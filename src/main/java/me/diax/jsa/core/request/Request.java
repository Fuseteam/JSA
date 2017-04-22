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

import com.mashape.unirest.http.HttpMethod;

/**
 * Created by Felix Vogel on 22/04/17
 * 
 * The class representing a http/https request.
 */
public class Request {

	protected final HttpMethod method;
	protected final String baseUrl, point;
	protected final Headers headers;
	protected final boolean requiresBody;
	
	public Request(HttpMethod method, String baseUrl) {
		this.method = method;
		this.baseUrl = baseUrl;
		this.point = "";
		this.headers = new Headers();
		this.requiresBody = false;
	}
	
	public Request(HttpMethod method, String baseUrl, Headers header) {
		this.method = method;
		this.baseUrl = baseUrl;
		this.point = "";
		this.headers = header;
		this.requiresBody = false;
	}
	
	public Request(HttpMethod method, String baseUrl, String point, Headers header) {
		this.method = method;
		this.baseUrl = baseUrl;
		this.point = point;
		this.headers = header;
		this.requiresBody = false;
	}
	
	public Request(HttpMethod method, String baseUrl, String point, Headers header, boolean requiresBody) {
		this.method = method;
		this.baseUrl = baseUrl;
		this.point = point;
		this.headers = header;
		this.requiresBody = requiresBody;
	}
	
}