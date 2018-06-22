package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class ExtraData extends Type
{

    public int key;
    public short value;

    public ExtraData()
    {
    }

    public ExtraData(int key, short value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(key);
        _buffer.writeLittleEndianShort(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        key = _buffer.readVaruint();
        value = _buffer.readLittleEndianShort();
    }

}
