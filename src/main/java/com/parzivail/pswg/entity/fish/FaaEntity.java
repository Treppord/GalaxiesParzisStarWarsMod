package com.parzivail.pswg.entity.fish;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class FaaEntity extends SchoolingFishEntity
{
	public FaaEntity(EntityType<? extends FaaEntity> entityType, World world)
	{
		super(entityType, world);
	}

	protected ItemStack getFishBucketItem()
	{
		// TODO
		return new ItemStack(Items.COD_BUCKET);
	}

	protected SoundEvent getAmbientSound()
	{
		// TODO
		return SoundEvents.ENTITY_COD_AMBIENT;
	}

	protected SoundEvent getDeathSound()
	{
		// TODO
		return SoundEvents.ENTITY_COD_DEATH;
	}

	protected SoundEvent getHurtSound(DamageSource source)
	{
		// TODO
		return SoundEvents.ENTITY_COD_HURT;
	}

	protected SoundEvent getFlopSound()
	{
		// TODO
		return SoundEvents.ENTITY_COD_FLOP;
	}
}