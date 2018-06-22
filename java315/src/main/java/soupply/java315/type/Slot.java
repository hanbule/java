package soupply.java315.type;

import java.util.*;
import soupply.util.*;

public class Slot extends Type
{

    public short id;
    public byte count;
    public short damage;
    public byte[] nbt;

    public Slot()
    {
    }

    public Slot(short id, byte count, short damage, byte[] nbt)
    {
        this.id = id;
        this.count = count;
        this.damage = damage;
        this.nbt = nbt;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianShort(id);
        if(id>0)
        {
            _buffer.writeByte(count);
            _buffer.writeBigEndianShort(damage);
            _buffer.writeBytes(nbt);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        id = _buffer.readBigEndianShort();
        if(id>0)
        {
            count = _buffer.readByte();
            damage = _buffer.readBigEndianShort();
            nbt = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
        }
    }

}
