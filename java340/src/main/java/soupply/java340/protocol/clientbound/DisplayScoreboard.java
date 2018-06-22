package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class DisplayScoreboard extends soupply.java340.Packet
{

    public static final int ID = 59;

    // position
    public static final byte LIST = (byte)0;
    public static final byte SIDEBAR = (byte)1;
    public static final byte BELOW_NAME = (byte)2;

    public byte position;
    public String scoreName;

    public DisplayScoreboard()
    {
    }

    public DisplayScoreboard(byte position, String scoreName)
    {
        this.position = position;
        this.scoreName = scoreName;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(position);
        byte[] cncvy1 = _buffer.convertString(scoreName);
        _buffer.writeVaruint((int)cncvy1.length);
        _buffer.writeBytes(cncvy1);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readByte();
        final int bvcncvy1 = _buffer.readVaruint();
        scoreName = _buffer.readString(bvcncvy1);
    }

    public static DisplayScoreboard fromBuffer(byte[] buffer)
    {
        DisplayScoreboard packet = new DisplayScoreboard();
        packet.safeDecode(buffer);
        return packet;
    }

}
