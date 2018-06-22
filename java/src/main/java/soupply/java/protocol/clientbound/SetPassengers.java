package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SetPassengers extends soupply.java.Packet
{

    public static final int ID = 67;

    public int entityId;
    public int[] passengers;

    public SetPassengers()
    {
    }

    public SetPassengers(int entityId, int[] passengers)
    {
        this.entityId = entityId;
        this.passengers = passengers;
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
        _buffer.writeVaruint((int)passengers.length);
        for(int cfcvzvc:passengers)
        {
            _buffer.writeVaruint(cfcvzvc);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        final int bbcnbdcm = _buffer.readVaruint();
        passengers = new int[bbcnbdcm];
        for(int cfcvzvc=0;cfcvzvc<passengers.length;cfcvzvc++)
        {
            passengers[cfcvzvc] = _buffer.readVaruint();
        }
    }

    public static SetPassengers fromBuffer(byte[] buffer)
    {
        SetPassengers packet = new SetPassengers();
        packet.safeDecode(buffer);
        return packet;
    }

}
