/*
 * Copyright � 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.enigma.regexlist;

import java.util.regex.Pattern;

public class RegexListEntry
{
	private final Pattern regex;
	private final String replacement;
	
	public RegexListEntry(String regex, String replacement)
	{
		this.regex = Pattern.compile(regex);
		this.replacement = replacement;
	}

	public Pattern getRegex()
	{
		return regex;
	}

	public String getReplacement()
	{
		return replacement;
	}
}
