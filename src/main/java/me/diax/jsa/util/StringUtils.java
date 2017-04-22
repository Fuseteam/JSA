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

package me.diax.jsa.util;

/**
 * StringUtils for String stuff.
 * @author Felix Vogel
 */
public class StringUtils {

	/**
	 * Count a specific {@link CharSequence} in a {@link String}
	 * @param sequence The {@link CharSequence} to count
	 * @param string The {@link String} to 'count' from
	 * @return The amount of elements found
	 */
	public static int count(CharSequence sequence, String string) {
		if(sequence==null||sequence.length()<1) throw new IllegalArgumentException("Count element can't be null or empty.");
		if(string==null) throw new NullPointerException("The provided String is null."); 
		int remaining = string.length()-string.replace(sequence, "").length();
		if(sequence.length()>1) remaining = remaining/sequence.length();
		return remaining;
	}
	
}
