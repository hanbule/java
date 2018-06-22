package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerLook extends soupply.java335.Packet
{

    public static final int ID = 16;

    public float yaw;
    public float pitch;
    public boolean onGround;

    public PlayerLook()
    {
    }

    public PlayerLook(float yaw, float pitch, boolean onGround)
    {
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianFloat(yaw);
        _buffer.writeBigEndianFloat(pitch);
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        yaw = _buffer.readBigEndianFloat();
        pitch = _buffer.readBigEndianFloat();
        onGround = _buffer.readBool();
    }

    public static PlayerLook fromBuffer(byte[] buffer)
    {
        PlayerLook packet = new PlayerLook();
        packet.safeDecode(buffer);
        return packet;
    }

}
