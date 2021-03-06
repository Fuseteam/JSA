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
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.BaseRequest;
import com.mashape.unirest.request.HttpRequest;
import me.diax.jsa.util.StringUtils;

import java.util.concurrent.ExecutionException;

/**
 * Created by Felix Vogel on 22/04/17
 * 
 * This class contains all the valid requests
 */
public class Requests {

	protected static final String apiBaseUrl = "https://api.botframework.com";
	protected static final String tokenBaseUrl = "https://login.microsoftonline.com/common/oauth2/v2.0/token";
	public static final Request getToken = new Request(HttpMethod.POST, tokenBaseUrl, new Headers().add("Host", "login.microsoftonline.com").add("Content-Type", "application/x-www-form-urlencoded"), true); //body - grant_type=client_credentials&client_id=<YOUR MICROSOFT APP ID>&client_secret=<YOUR MICROSOFT APP PASSWORD>&scope=https%3A%2F%2Fgraph.microsoft.com%2F.default
    protected static final String version = "/v3";
    protected static final String apiUrl = apiBaseUrl + version;
    protected static final String conversation = apiUrl + "/conversation";
    protected static final String activities = conversation + "/%s/activities";
    protected static final String activityInfo = activities + "/%s";
    protected static final String conversationMembers = conversation + "/members";
    protected static final String activityMembers = activityInfo + "/members";
    protected static final String botState = apiUrl + "/botstate/%s";
    protected static final String deleteUser = botState + "/users/%s";
    protected static final String conversationInfo = botState + "/conversations/%s";
    protected static final String userInfo = conversationInfo + "/users/%s";

    public Response build(Request request, String... params) {
        BaseRequest _request = create(request, params);
		HttpResponse<JsonNode> data = null;
		try {
			data = _request.asJsonAsync().get();
		} catch(InterruptedException e) {
			return new Response(e);
		} catch(ExecutionException e) {
			return new Response(e);
		}
		return new Response(data);
	}
	
	protected BaseRequest create(Request request, String... params) {
		String url = request.baseUrl;
		if(!request.point.isEmpty()) {
			int count = StringUtils.count("%s", request.point);
			if(count<params.length||params.length>count) throw new IllegalArgumentException("Param count and %s count do nat match!");
			else url += String.format(request.point, (Object[])params);
		}
		String body = request.body;
		if((body==null||body.isEmpty()||!request.hasBody())&&request.requiresBody) throw new IllegalArgumentException("Request requires body.");
		if(request.requiresBody) switch(request.method) {
			case DELETE:
				return addHeaders(Unirest.delete(url).body(body), request.headers);
			case PATCH:
				return addHeaders(Unirest.patch(url).body(body), request.headers);
			case POST:
				return addHeaders(Unirest.post(url).body(body), request.headers);
			case PUT:
				return addHeaders(Unirest.put(url).body(body), request.headers);
			default:
				throw new DefaultException(request.method.name()+" is either not cased or a non-body method.");
		} else switch(request.method) {
			case DELETE:
				return addHeaders(Unirest.delete(url), request.headers);
			case GET:
				return addHeaders(Unirest.get(url), request.headers);
			case PATCH:
				return addHeaders(Unirest.patch(url), request.headers);
			case POST:
				return addHeaders(Unirest.post(url), request.headers);
			case PUT:
				return addHeaders(Unirest.put(url), request.headers);
			default:
				throw new DefaultException(request.method.name()+" is not cased.");
		}
	}
	
	protected <T extends BaseRequest> T addHeaders(T request, Headers header) {
		if(header==null) throw new NullPointerException("Headers are required.");
		if(!header.map.isEmpty()) {
			HttpRequest httpRequest = request.getHttpRequest();
            header.map.keySet().forEach(key -> httpRequest.header(key, header.map.get(key)));
        }
		return request;
	}
	
	public class DefaultException extends RuntimeException {

        private static final long serialVersionUID = -1998707012868969655L;

		public DefaultException(String s) {
			super(s);
		}
	}
}