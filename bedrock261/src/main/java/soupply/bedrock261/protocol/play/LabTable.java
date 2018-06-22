package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class LabTable extends soupply.bedrock261.Packet
{

    public static final int ID = 109;

    public byte unknown0;
    public soupply.bedrock261.type.BlockPosition position;
    public byte reactionType;

    public LabTable()
    {
        this.position = new soupply.bedrock261.type.BlockPosition();
    }

    public LabTable(byte unknown0, soupply.bedrock261.type.BlockPosition position, byte reactionType)
    {
        this.unknown0 = unknown0;
        this.position = position;
        this.reactionType = reactionType;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(unknown0);
        position.encodeBody(_buffer);
        _buffer.writeByte(reactionType);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        unknown0 = _buffer.readByte();
        position.decodeBody(_buffer);
        reactionType = _buffer.readByte();
    }

    public static LabTable fromBuffer(byte[] buffer)
    {
        LabTable packet = new LabTable();
        packet.safeDecode(buffer);
        return packet;
    }

}
