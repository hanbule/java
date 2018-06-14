package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class MobArmorEquipment extends soupply.bedrock201.Packet
{

    public static final int ID = 32;

    public long entityId;
    public soupply.bedrock201.type.Slot[] armor;

    public MobArmorEquipment()
    {
    }

    public MobArmorEquipment(long entityId, soupply.bedrock201.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
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
