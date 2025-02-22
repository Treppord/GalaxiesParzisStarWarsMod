package com.parzivail.pswg.client.species;

import com.parzivail.util.client.TooltipUtil;
import net.minecraft.util.Identifier;

public enum SwgSpeciesLore
{
	DESCRIPTION("description");

	private final String langKey;

	SwgSpeciesLore(String langKey)
	{
		this.langKey = langKey;
	}

	public String createLanguageKey(Identifier slug)
	{
		return TooltipUtil.getLoreKey("species", new Identifier(slug.getNamespace(), slug.getPath() + "." + langKey));
	}
}
