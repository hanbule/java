package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class VehicleMove extends soupply.java338.Packet
{

    public static final int ID = 16;

    public Tuples.DoubleXYZ position;
    public float yaw;
    public float pitch;

    public VehicleMove()
    {
    }

    public VehicleMove(Tuples.DoubleXYZ position, float yaw, float pitch)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
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
