package soupply.bedrock274.metadata;

import java.util.HashMap;
import soupply.util.*;

public class Metadata extends HashMap<Integer, MetadataValue>
{

    public void add(MetadataValue value)
    {
        this.put(value.id, value);
    }

    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(this.size());
        for(MetadataValue value : this.values())
        {
            value.encodeBody(_buffer);
        }
    }

    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        int length = _buffer.readVaruint();
        while(length-- > 0)
        {
            final int id = _buffer.readVaruint();
            final int type = _buffer.readVaruint();
            MetadataValue value = getMetadataValue(id, type);
            value.decodeBody(_buffer);
            this.add(value);
        }
    }

    public static MetadataValue getMetadataValue(int id, int type) throws MetadataException
    {
        switch(type)
        {
            case 0: return new MetadataByte(id);
            case 1: return new MetadataShort(id);
            case 2: return new MetadataInt(id);
            case 3: return new MetadataFloat(id);
            case 4: return new MetadataString(id);
            case 5: return new MetadataSlot(id);
            case 6: return new MetadataBlockPosition(id);
            case 7: return new MetadataLong(id);
            case 8: return new MetadataEntityPosition(id);
            default: throw new MetadataException(id, type);
        }
    }
}
