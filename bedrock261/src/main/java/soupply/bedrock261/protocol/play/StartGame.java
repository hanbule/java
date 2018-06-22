package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class StartGame extends soupply.bedrock261.Packet
{

    public static final int ID = 11;

    // gamemode
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;

    // dimension
    public static final int OVERWORLD = (int)0;
    public static final int NETHER = (int)1;
    public static final int END = (int)2;

    // generator
    public static final int OLD = (int)0;
    public static final int INFINITE = (int)1;
    public static final int FLAT = (int)2;

    // difficulty
    public static final int PEACEFUL = (int)0;
    public static final int EASY = (int)1;
    public static final int NORMAL = (int)2;
    public static final int HARD = (int)3;

    // version
    public static final byte VANILLA = (byte)0;
    public static final byte EDUCATION = (byte)1;

    public long entityId;
    public long runtimeId;
    public int gamemode;
    public FloatXYZ position;
    public float yaw;
    public float pitch;
    public int seed;
    public int dimension = 0;
    public int generator = 1;
    public int worldGamemode;
    public int difficulty;
    public IntXYZ spawnPosition;
    public boolean loadedInCreative;
    public int time;
    public byte version;
    public float rainLevel;
    public float lightningLevel;
    public boolean multiplayerGame = true;
    public boolean broadcastToLan;
    public boolean broadcastToXbl;
    public boolean commandsEnabled;
    public boolean textureRequired;
    public soupply.bedrock261.type.Rule[] gameRules;
    public boolean bonusChestEnabled;
    public boolean startWithMapEnabled;
    public boolean trustPlayersEnabled;
    public int defaultPermissionLevel;
    public int xboxLiveBroadcastMode;
    public int serverChunkTickRadius;
    public String levelId;
    public String worldName;
    public String premiumWorldTemplate;
    public boolean unknown32;
    public long worldTicks;
    public int enchantmentSeed;

    public StartGame()
    {
        this.position = new FloatXYZ();
        this.spawnPosition = new IntXYZ();
    }

    public StartGame(long entityId, long runtimeId, int gamemode, FloatXYZ position, float yaw, float pitch, int seed, int dimension, int generator, int worldGamemode, int difficulty, IntXYZ spawnPosition, boolean loadedInCreative, int time, byte version, float rainLevel, float lightningLevel, boolean multiplayerGame, boolean broadcastToLan, boolean broadcastToXbl, boolean commandsEnabled, boolean textureRequired, soupply.bedrock261.type.Rule[] gameRules, boolean bonusChestEnabled, boolean startWithMapEnabled, boolean trustPlayersEnabled, int defaultPermissionLevel, int xboxLiveBroadcastMode, int serverChunkTickRadius, String levelId, String worldName, String premiumWorldTemplate, boolean unknown32, long worldTicks, int enchantmentSeed)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.gamemode = gamemode;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.seed = seed;
        this.dimension = dimension;
        this.generator = generator;
        this.worldGamemode = worldGamemode;
        this.difficulty = difficulty;
        this.spawnPosition = spawnPosition;
        this.loadedInCreative = loadedInCreative;
        this.time = time;
        this.version = version;
        this.rainLevel = rainLevel;
        this.lightningLevel = lightningLevel;
        this.multiplayerGame = multiplayerGame;
        this.broadcastToLan = broadcastToLan;
        this.broadcastToXbl = broadcastToXbl;
        this.commandsEnabled = commandsEnabled;
        this.textureRequired = textureRequired;
        this.gameRules = gameRules;
        this.bonusChestEnabled = bonusChestEnabled;
        this.startWithMapEnabled = startWithMapEnabled;
        this.trustPlayersEnabled = trustPlayersEnabled;
        this.defaultPermissionLevel = defaultPermissionLevel;
        this.xboxLiveBroadcastMode = xboxLiveBroadcastMode;
        this.serverChunkTickRadius = serverChunkTickRadius;
        this.levelId = levelId;
        this.worldName = worldName;
        this.premiumWorldTemplate = premiumWorldTemplate;
        this.unknown32 = unknown32;
        this.worldTicks = worldTicks;
        this.enchantmentSeed = enchantmentSeed;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeVarulong(runtimeId);
        _buffer.writeVarint(gamemode);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeLittleEndianFloat(yaw);
        _buffer.writeLittleEndianFloat(pitch);
        _buffer.writeVarint(seed);
        _buffer.writeVarint(dimension);
        _buffer.writeVarint(generator);
        _buffer.writeVarint(worldGamemode);
        _buffer.writeVarint(difficulty);
        _buffer.writeVarint(spawnPosition.x);
        _buffer.writeVarint(spawnPosition.y);
        _buffer.writeVarint(spawnPosition.z);
        _buffer.writeBool(loadedInCreative);
        _buffer.writeVarint(time);
        _buffer.writeByte(version);
        _buffer.writeLittleEndianFloat(rainLevel);
        _buffer.writeLittleEndianFloat(lightningLevel);
        _buffer.writeBool(multiplayerGame);
        _buffer.writeBool(broadcastToLan);
        _buffer.writeBool(broadcastToXbl);
        _buffer.writeBool(commandsEnabled);
        _buffer.writeBool(textureRequired);
        _buffer.writeVaruint((int)gameRules.length);
        for(soupply.bedrock261.type.Rule zfzjbv:gameRules)
        {
            zfzjbv.encodeBody(_buffer);
        }
        _buffer.writeBool(bonusChestEnabled);
        _buffer.writeBool(startWithMapEnabled);
        _buffer.writeBool(trustPlayersEnabled);
        _buffer.writeVarint(defaultPermissionLevel);
        _buffer.writeVarint(xboxLiveBroadcastMode);
        _buffer.writeLittleEndianInt(serverChunkTickRadius);
        byte[] bvzxz = _buffer.convertString(levelId);
        _buffer.writeVaruint((int)bvzxz.length);
        _buffer.writeBytes(bvzxz);
        byte[] d9bry1 = _buffer.convertString(worldName);
        _buffer.writeVaruint((int)d9bry1.length);
        _buffer.writeBytes(d9bry1);
        byte[] cjblbdcx = _buffer.convertString(premiumWorldTemplate);
        _buffer.writeVaruint((int)cjblbdcx.length);
        _buffer.writeBytes(cjblbdcx);
        _buffer.writeBool(unknown32);
        _buffer.writeLittleEndianLong(worldTicks);
        _buffer.writeVarint(enchantmentSeed);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        gamemode = _buffer.readVarint();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        yaw = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianFloat();
        seed = _buffer.readVarint();
        dimension = _buffer.readVarint();
        generator = _buffer.readVarint();
        worldGamemode = _buffer.readVarint();
        difficulty = _buffer.readVarint();
        spawnPosition.x = _buffer.readVarint();
        spawnPosition.y = _buffer.readVarint();
        spawnPosition.z = _buffer.readVarint();
        loadedInCreative = _buffer.readBool();
        time = _buffer.readVarint();
        version = _buffer.readByte();
        rainLevel = _buffer.readLittleEndianFloat();
        lightningLevel = _buffer.readLittleEndianFloat();
        multiplayerGame = _buffer.readBool();
        broadcastToLan = _buffer.readBool();
        broadcastToXbl = _buffer.readBool();
        commandsEnabled = _buffer.readBool();
        textureRequired = _buffer.readBool();
        final int bdbvdxc = _buffer.readVaruint();
        gameRules = new soupply.bedrock261.type.Rule[bdbvdxc];
        for(int zfzjbv=0;zfzjbv<gameRules.length;zfzjbv++)
        {
            gameRules[zfzjbv].decodeBody(_buffer);
        }
        bonusChestEnabled = _buffer.readBool();
        startWithMapEnabled = _buffer.readBool();
        trustPlayersEnabled = _buffer.readBool();
        defaultPermissionLevel = _buffer.readVarint();
        xboxLiveBroadcastMode = _buffer.readVarint();
        serverChunkTickRadius = _buffer.readLittleEndianInt();
        final int bvbvzxz = _buffer.readVaruint();
        levelId = _buffer.readString(bvbvzxz);
        final int bvd9bry1 = _buffer.readVaruint();
        worldName = _buffer.readString(bvd9bry1);
        final int bvcjblbd = _buffer.readVaruint();
        premiumWorldTemplate = _buffer.readString(bvcjblbd);
        unknown32 = _buffer.readBool();
        worldTicks = _buffer.readLittleEndianLong();
        enchantmentSeed = _buffer.readVarint();
    }

    public static StartGame fromBuffer(byte[] buffer)
    {
        StartGame packet = new StartGame();
        packet.safeDecode(buffer);
        return packet;
    }

}
