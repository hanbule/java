package soupply.java335.type;

import java.util.*;
import soupply.util.*;

class ListUpdateLatency extends Type
{

    public UUID uuid;
    public int latency;

    public ListUpdateLatency()
    {
        this.uuid = new UUID();
    }

    public ListUpdateLatency(UUID uuid, int latency)
    {
        this.uuid = uuid;
        this.latency = latency;
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