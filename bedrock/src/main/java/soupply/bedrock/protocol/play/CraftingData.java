package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class CraftingData extends soupply.bedrock.Packet
{

    public static final int ID = 52;

    public soupply.bedrock.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)recipes.length);
        for(soupply.bedrock.type.Recipe cvabc:recipes)
        {
            cvabc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bjylzm = _buffer.readVaruint();
        recipes = new soupply.bedrock.type.Recipe[bjylzm];
        for(int cvabc=0;cvabc<recipes.length;cvabc++)
        {
            recipes[cvabc].decodeBody(_buffer);
        }
    }

    public static CraftingData fromBuffer(byte[] buffer)
    {
        CraftingData packet = new CraftingData();
        packet.safeDecode(buffer);
        return packet;
    }

}
