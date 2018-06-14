package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java315.Packet
{

    public static final int ID = 57;

    public int entityId;
    public soupply.java315.Metadata metadata;

    public EntityMetadata()
    {
    }

    public EntityMetadata(int entityId, soupply.java315.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
