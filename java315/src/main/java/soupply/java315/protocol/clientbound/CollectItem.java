package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class CollectItem extends soupply.java315.Packet
{

    public static final int ID = 72;

    public int collected;
    public int collector;
    public int count;

    public CollectItem()
    {
    }

    public CollectItem(int collected, int collector, int count)
    {
        this.collected = collected;
        this.collector = collector;
        this.count = count;
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
