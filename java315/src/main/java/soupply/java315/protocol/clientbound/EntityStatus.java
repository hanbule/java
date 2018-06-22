package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityStatus extends soupply.java315.Packet
{

    public static final int ID = 27;

    // status
    public static final byte SPAWN_TIPPED_ARROW_PARTICLE_EFFECTS = (byte)0;
    public static final byte PLAY_JUMPING_ANIMATION_AND_PARTICLES = (byte)1;
    public static final byte RESET_SPAWNER_DELAY = (byte)1;
    public static final byte PLAY_HURT_ANIMATION_AND_SOUND = (byte)2;
    public static final byte PLAY_DEATH_ANIMATION_AND_SOUND = (byte)3;
    public static final byte PLAY_ATTACK_ANIMATION_AND_SOUND = (byte)4;
    public static final byte SPAWN_SMOKE_PARTICLES = (byte)6;
    public static final byte SPAWN_HEART_PARTICLES = (byte)7;
    public static final byte PLAY_SHAKING_WATER_ANIMATION = (byte)8;
    public static final byte FINISHED_CONSUMING = (byte)9;
    public static final byte PLAY_EATING_GRASS_ANIMATION = (byte)10;
    public static final byte IGNITE_MINECART_TNT = (byte)10;
    public static final byte HOLD_POPPY = (byte)11;
    public static final byte SPAWN_VILLAGER_MATING_HEART_PARTICLES = (byte)12;
    public static final byte SPAWN_VILLAGER_ANGRY_PARTICLES = (byte)13;
    public static final byte SPAWN_VILLAGER_HAPPY_PARTICLES = (byte)14;
    public static final byte SPAWN_WITCH_MAGIC_PARTICLES = (byte)15;
    public static final byte PLAY_ZOMBIE_CURE_FINISHED_SOUND = (byte)16;
    public static final byte SPAWN_FIREWORK_EXPLOSION_EFFECT = (byte)17;
    public static final byte SPAWN_LOVE_PARTICLES = (byte)18;
    public static final byte RESET_SQUID_ROTATION = (byte)19;
    public static final byte SPAWN_EXPLOSION_PARTICLES = (byte)20;
    public static final byte PLAY_GUARDIAN_SOUND_EFFECT = (byte)21;
    public static final byte ENABLE_REDUCED_DEBUG_SCREEN = (byte)22;
    public static final byte DISABLE_REDUCED_DEBUG_SCREEN = (byte)23;
    public static final byte SET_OP_PERMISSION_LEVEL_0 = (byte)24;
    public static final byte SET_OP_PERMISSION_LEVEL_1 = (byte)25;
    public static final byte SET_OP_PERMISSION_LEVEL_2 = (byte)26;
    public static final byte SET_OP_PERMISSION_LEVEL_3 = (byte)27;
    public static final byte SET_OP_PERMISSION_LEVEL_4 = (byte)28;
    public static final byte PLAY_SHIELD_BLOCK_SOUND = (byte)29;
    public static final byte PLAY_SHIELD_BREAK_SOUND = (byte)30;
    public static final byte HOOK_KNOCKBACK = (byte)31;
    public static final byte PLAY_HIT_SOUND = (byte)32;
    public static final byte PLAY_THORNS_HURT_ANIMATION_AND_SOUND = (byte)33;
    public static final byte REMOVE_POPPY = (byte)34;
    public static final byte PLAY_TOTEM_UNDYING_ANIMATION = (byte)35;

    public int entityId;
    public byte status;

    public EntityStatus()
    {
    }

    public EntityStatus(int entityId, byte status)
    {
        this.entityId = entityId;
        this.status = status;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(entityId);
        _buffer.writeByte(status);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readBigEndianInt();
        status = _buffer.readByte();
    }

    public static EntityStatus fromBuffer(byte[] buffer)
    {
        EntityStatus packet = new EntityStatus();
        packet.safeDecode(buffer);
        return packet;
    }

}
