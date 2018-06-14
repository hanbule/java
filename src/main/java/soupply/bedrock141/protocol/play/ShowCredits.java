package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class ShowCredits extends soupply.bedrock141.Packet
{

    public static final int ID = 75;

    // status
    public static final int START = 0;
    public static final int END = 1;

    public long entityId;
    public int status;

    public ShowCredits()
    {
    }

    public ShowCredits(long entityId, int status)
    {
        this.entityId = entityId;
        this.status = status;
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
