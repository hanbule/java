package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class Text extends soupply.bedrock160.Packet
{

    public static final int ID = 9;

    public byte type;
    public boolean unknown1;

    public Text()
    {
    }

    public Text(byte type, boolean unknown1)
    {
        this.type = type;
        this.unknown1 = unknown1;
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