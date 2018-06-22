package soupply.java316.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataByte extends MetadataValue
{

    public byte value;

    public MetadataByte(byte id, byte value)
    {
        super(id, 0);
        this.value = value;
    }

    public MetadataByte(byte id)
    {
        this(id, 0);
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeByte(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value = _buffer.readByte();
    }

}
