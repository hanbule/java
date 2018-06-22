package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class CollectItem extends soupply.java210.Packet
{

    public static final int ID = 72;

    public int collected;
    public int collector;

    public CollectItem()
    {
    }

    public CollectItem(int collected, int collector)
    {
        this.collected = collected;
        this.collector = collector;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(collected);
        _buffer.writeVaruint(collector);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        collected = _buffer.readVaruint();
        collector = _buffer.readVaruint();
    }

    public static CollectItem fromBuffer(byte[] buffer)
    {
        CollectItem packet = new CollectItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
