package com.parzivail.pswg.container;

import com.parzivail.pswg.Resources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class SwgDamageTypes
{
	public static final RegistryKey<DamageType> BLASTER = register("blaster");
	public static final RegistryKey<DamageType> BLASTER_SLUG = register("blaster_slug");

	private static RegistryKey<DamageType> register(String blaster)
	{
		return RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Resources.id(blaster));
	}
}
