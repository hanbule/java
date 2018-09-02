package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class EntityPickRequest extends soupply.bedrock282.Packet
{

    public static final int ID = 35;

    public long entityType;
    public byte slot;

    public EntityPickRequest()
    {
    }

    public EntityPickRequest(long entityType, byte slot)
    {
        this.entityType = entityType;
        this.slot = slot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianLong(entityType);
        _buffer.writeByte(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityType = _buffer.readLittleEndianLong();
        slot = _buffer.readByte();
    }

    public static EntityPickRequest fromBuffer(byte[] buffer)
    {
        EntityPickRequest packet = new EntityPickRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
