package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock201.Packet
{

    public static final int ID = 71;

    public soupply.bedrock201.type.BlockPosition position;
    public soupply.bedrock201.type.Slot item;

    public ItemFrameDropItem()
    {
        this.position = new soupply.bedrock201.type.BlockPosition();
        this.item = new soupply.bedrock201.type.Slot();
    }

    public ItemFrameDropItem(soupply.bedrock201.type.BlockPosition position, soupply.bedrock201.type.Slot item)
    {
        this.position = position;
        this.item = item;
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