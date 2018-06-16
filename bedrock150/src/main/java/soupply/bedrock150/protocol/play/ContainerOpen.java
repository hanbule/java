package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class ContainerOpen extends soupply.bedrock150.Packet
{

    public static final int ID = 46;

    public byte window;
    public byte type;
    public soupply.bedrock150.type.BlockPosition position;
    public long entityId;

    public ContainerOpen()
    {
        this.position = new soupply.bedrock150.type.BlockPosition();
    }

    public ContainerOpen(byte window, byte type, soupply.bedrock150.type.BlockPosition position, long entityId)
    {
        this.window = window;
        this.type = type;
        this.position = position;
        this.entityId = entityId;
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