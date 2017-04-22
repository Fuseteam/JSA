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

import java.util.function.Consumer;

import com.mashape.unirest.http.JsonNode;

/**
 * Created by Felix Vogel on 22/04/17
 * 
 * This class represents the http/https request response
 */
public class Response {

	protected JsonNode data;
	protected boolean failed;
	protected Throwable reason;
	
	public Response(JsonNode data) {
		this.data = data;
		this.failed = false;
		this.reason = null;
	}
	
	public Response(Throwable reason) {
		this.data = null;
		this.failed = true;
		this.reason = reason;
	}
	
	public void handle(Consumer<JsonNode> handle) {
		handle(handle, null);
	}
	
	public void handle(Consumer<JsonNode> success, Consumer<Throwable> failure) {
		if(success!=null&&!this.failed) if(data!=null) success.accept(data);
		if(failure!=null&&this.failed) {
			if(reason!=null) failure.accept(reason);
		}
	}

	public JsonNode get() {
		if(failed) return null;
		else return data;
	}
}