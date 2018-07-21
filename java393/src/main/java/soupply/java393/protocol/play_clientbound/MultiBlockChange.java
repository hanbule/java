package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class MultiBlockChange extends soupply.java393.Packet
{

    public static final int ID = 15;

    public IntXZ chunk;
    public soupply.java393.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new IntXZ();
    }

    public MultiBlockChange(IntXZ chunk, soupply.java393.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(chunk.x);
        _buffer.writeBigEndianInt(chunk.z);
        _buffer.writeVaruint((int)changes.length);
        for(soupply.java393.type.BlockChange yhbdc:changes)
        {
            yhbdc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        chunk.x = _buffer.readBigEndianInt();
        chunk.z = _buffer.readBigEndianInt();
        final int bny5zm = _buffer.readVaruint();
        changes = new soupply.java393.type.BlockChange[bny5zm];
        for(int yhbdc=0;yhbdc<changes.length;yhbdc++)
        {
            changes[yhbdc].decodeBody(_buffer);
        }
    }

    public static MultiBlockChange fromBuffer(byte[] buffer)
    {
        MultiBlockChange packet = new MultiBlockChange();
        packet.safeDecode(buffer);
        return packet;
    }

}