package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPosition extends soupply.java338.Packet
{

    public static final int ID = 70;

    public long position;

    public SpawnPosition()
    {
    }

    public SpawnPosition(long position)
    {
        this.position = position;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(position);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readBigEndianLong();
    }

    public static SpawnPosition fromBuffer(byte[] buffer)
    {
        SpawnPosition packet = new SpawnPosition();
        packet.safeDecode(buffer);
        return packet;
    }

}
