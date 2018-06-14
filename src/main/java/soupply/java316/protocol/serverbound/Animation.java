package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class Animation extends soupply.java316.Packet
{

    public static final int ID = 26;

    // hand
    public static final int MAIN_HAND = 0;
    public static final int OFF_HAND = 1;

    public int hand;

    public Animation()
    {
    }

    public Animation(int hand)
    {
        this.hand = hand;
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
