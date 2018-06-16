package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class ResourcePackClientResponse extends soupply.bedrock.Packet
{

    public static final int ID = 8;

    // status
    public static final byte REFUSED = 1;
    public static final byte SEND_PACKS = 2;
    public static final byte HAVE_ALL_PACKS = 3;
    public static final byte COMPLETED = 4;

    public byte status;
    public String[] packIds;

    public ResourcePackClientResponse()
    {
    }

    public ResourcePackClientResponse(byte status, String[] packIds)
    {
        this.status = status;
        this.packIds = packIds;
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