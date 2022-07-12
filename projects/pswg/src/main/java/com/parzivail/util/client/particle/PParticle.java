package com.parzivail.util.client.particle;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.registry.Registry;

public class PParticle extends ParticleType<PParticle> implements ParticleEffect
{
	private static final ParticleEffect.Factory<PParticle> PARAMETER_FACTORY = new ParticleEffect.Factory<>()
	{
		@Override
		public PParticle read(ParticleType<PParticle> particleType, StringReader stringReader)
		{
			return (PParticle)particleType;
		}

		@Override
		public PParticle read(ParticleType<PParticle> particleType, PacketByteBuf packetByteBuf)
		{
			return (PParticle)particleType;
		}
	};
	private final Codec<PParticle> codec = Codec.unit(this::getType);

	public PParticle(boolean alwaysShow)
	{
		super(alwaysShow, PARAMETER_FACTORY);
	}

	@Override
	public PParticle getType()
	{
		return this;
	}

	@Override
	public Codec<PParticle> getCodec()
	{
		return this.codec;
	}

	@Override
	public void write(PacketByteBuf buf)
	{
	}

	@Override
	public String asString()
	{
		return Registry.PARTICLE_TYPE.getId(this).toString();
	}
}