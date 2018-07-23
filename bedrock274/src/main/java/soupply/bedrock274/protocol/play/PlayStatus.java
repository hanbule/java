package soupply.bedrock274.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayStatus extends soupply.bedrock274.Packet
{

    public static final int ID = 2;

    // status
    public static final int OK = (int)0;
    public static final int OUTDATED_CLIENT = (int)1;
    public static final int OUTDATED_SERVER = (int)2;
    public static final int SPAWNED = (int)3;
    public static final int INVALID_TENANT = (int)4;
    public static final int EDITION_MISMATCH_EDU_TO_VANILLA = (int)5;
    public static final int EDITION_MISMATCH_VANILLA_TO_EDU = (int)6;
    public static final int SERVER_FULL = (int)7;

    public int status;

    public PlayStatus()
    {
    }

    public PlayStatus(int status)
    {
        this.status = status;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(status);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        status = _buffer.readBigEndianInt();
    }

    public static PlayStatus fromBuffer(byte[] buffer)
    {
        PlayStatus packet = new PlayStatus();
        packet.safeDecode(buffer);
        return packet;
    }

}
