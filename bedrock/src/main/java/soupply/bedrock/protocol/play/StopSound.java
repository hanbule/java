package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class StopSound extends soupply.bedrock.Packet
{

    public static final int ID = 87;

    public String name;
    public boolean stopAll;

    public StopSound()
    {
    }

    public StopSound(String name, boolean stopAll)
    {
        this.name = name;
        this.stopAll = stopAll;
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