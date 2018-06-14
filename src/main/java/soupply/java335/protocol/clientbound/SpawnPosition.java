package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnPosition extends soupply.java335.Packet
{

    public static final int ID = 69;

    public long position;

    public SpawnPosition()
    {
    }

    public SpawnPosition(long position)
    {
        this.position = position;
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
