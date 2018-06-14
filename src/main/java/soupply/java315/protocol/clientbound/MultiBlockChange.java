package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java315.Packet
{

    public static final int ID = 16;

    public Tuples.IntXZ chunk;
    public soupply.java315.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java315.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
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
