package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePacksInfo extends soupply.bedrock282.Packet
{

    public static final int ID = 6;

    public boolean mustAccept;
    public soupply.bedrock282.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock282.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock282.type.PackWithSize[] behaviourPacks, soupply.bedrock282.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(mustAccept);
        _buffer.writeLittleEndianShort((short)behaviourPacks.length);
        for(soupply.bedrock282.type.PackWithSize yvyzbvuf:behaviourPacks)
        {
            yvyzbvuf.encodeBody(_buffer);
        }
        _buffer.writeLittleEndianShort((short)resourcePacks.length);
        for(soupply.bedrock282.type.PackWithSize cvbvyvyn:resourcePacks)
        {
            cvbvyvyn.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        mustAccept = _buffer.readBool();
        final int bjafa9cb = _buffer.readLittleEndianShort();
        behaviourPacks = new soupply.bedrock282.type.PackWithSize[bjafa9cb];
        for(int yvyzbvuf=0;yvyzbvuf<behaviourPacks.length;yvyzbvuf++)
        {
            behaviourPacks[yvyzbvuf].decodeBody(_buffer);
        }
        final int bjc9cnuf = _buffer.readLittleEndianShort();
        resourcePacks = new soupply.bedrock282.type.PackWithSize[bjc9cnuf];
        for(int cvbvyvyn=0;cvbvyvyn<resourcePacks.length;cvbvyvyn++)
        {
            resourcePacks[cvbvyvyn].decodeBody(_buffer);
        }
    }

    public static ResourcePacksInfo fromBuffer(byte[] buffer)
    {
        ResourcePacksInfo packet = new ResourcePacksInfo();
        packet.safeDecode(buffer);
        return packet;
    }

}
