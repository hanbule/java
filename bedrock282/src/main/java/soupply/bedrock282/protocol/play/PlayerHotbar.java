package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerHotbar extends soupply.bedrock282.Packet
{

    public static final int ID = 48;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
    }

    public static PlayerHotbar fromBuffer(byte[] buffer)
    {
        PlayerHotbar packet = new PlayerHotbar();
        packet.safeDecode(buffer);
        return packet;
    }

}
