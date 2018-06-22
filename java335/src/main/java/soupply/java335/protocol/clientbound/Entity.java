package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Entity extends soupply.java335.Packet
{

    public static final int ID = 37;

    public int entityId;

    public Entity()
    {
    }

    public Entity(int entityId)
    {
        this.entityId = entityId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
    }

    public static Entity fromBuffer(byte[] buffer)
    {
        Entity packet = new Entity();
        packet.safeDecode(buffer);
        return packet;
    }

}
