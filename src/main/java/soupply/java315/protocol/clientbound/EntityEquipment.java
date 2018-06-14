package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java315.Packet
{

    public static final int ID = 60;

    public int entityId;
    public int slot;
    public soupply.java315.type.Slot item;

    public EntityEquipment()
    {
    }

    public EntityEquipment(int entityId, int slot, soupply.java315.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
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
