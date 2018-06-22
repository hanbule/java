package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataNbt extends MetadataValue
{

    public byte[] value;

    public MetadataNbt(byte id, byte[] value)
    {
        super(id, (byte)13);
        this.value = value;
    }

    public MetadataNbt(byte id)
    {
        this(id, (byte[])0);
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeBytes(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

}