package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateEquip extends soupply.bedrock282.Packet
{

    public static final int ID = 81;

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

    public static UpdateEquip fromBuffer(byte[] buffer)
    {
        UpdateEquip packet = new UpdateEquip();
        packet.safeDecode(buffer);
        return packet;
    }

}