package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class GuiDataPickItem extends soupply.bedrock201.Packet
{

    public static final int ID = 54;

    public int slot;

    public GuiDataPickItem()
    {
    }

    public GuiDataPickItem(int slot)
    {
        this.slot = slot;
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
