package soupply.java315.protocol.login;

import java.util.*;
import soupply.util.*;

class EncryptionRequest extends soupply.java315.Packet
{

    public static final int ID = 1;

    public String serverId;
    public byte[] publicKey;
    public byte[] verifyToken;

    public EncryptionRequest()
    {
    }

    public EncryptionRequest(String serverId, byte[] publicKey, byte[] verifyToken)
    {
        this.serverId = serverId;
        this.publicKey = publicKey;
        this.verifyToken = verifyToken;
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
