package soupply.java335.protocol.login;

import java.util.*;
import soupply.util.*;

class SetCompression extends soupply.java335.Packet
{

    public static final int ID = 3;

    public int thresold;

    public SetCompression()
    {
    }

    public SetCompression(int thresold)
    {
        this.thresold = thresold;
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
