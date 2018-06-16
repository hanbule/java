package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class BossEvent extends soupply.bedrock141.Packet
{

    public static final int ID = 74;

    // event id
    public static final int ADD = 0;
    public static final int UPDATE = 1;
    public static final int REMOVE = 2;

    public long entityId;
    public int eventId;

    public BossEvent()
    {
    }

    public BossEvent(long entityId, int eventId)
    {
        this.entityId = entityId;
        this.eventId = eventId;
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
