package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class KeepAlive extends soupply.java210.Packet
{

    public static final int ID = 11;

    public int id;

    public KeepAlive()
    {
    }

    public KeepAlive(int id)
    {
        this.id = id;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(id);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        id = _buffer.readVaruint();
    }

    public static KeepAlive fromBuffer(byte[] buffer)
    {
        KeepAlive packet = new KeepAlive();
        packet.safeDecode(buffer);
        return packet;
    }

}
