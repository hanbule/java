package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class Camera extends soupply.java.Packet
{

    public static final int ID = 60;

    public int entityId;

    public Camera()
    {
    }

    public Camera(int entityId)
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

    public static Camera fromBuffer(byte[] buffer)
    {
        Camera packet = new Camera();
        packet.safeDecode(buffer);
        return packet;
    }

}
