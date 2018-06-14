package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class Respawn extends soupply.bedrock160.Packet
{

    public static final int ID = 45;

    public Tuples.FloatXYZ position;

    public Respawn()
    {
    }

    public Respawn(Tuples.FloatXYZ position)
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
