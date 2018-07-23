package soupply.bedrock274.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerList extends soupply.bedrock274.Packet
{

    public static final int ID = 63;

    public byte action;

    public PlayerList()
    {
    }

    public PlayerList(byte action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        action = _buffer.readByte();
    }

    public static PlayerList fromBuffer(byte[] buffer)
    {
        PlayerList packet = new PlayerList();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class Add extends Type
    {

        public soupply.bedrock274.type.PlayerList[] players;

        public Add()
        {
        }

        public Add(soupply.bedrock274.type.PlayerList[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 0;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(soupply.bedrock274.type.PlayerList cxevc:players)
            {
                cxevc.encodeBody(_buffer);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new soupply.bedrock274.type.PlayerList[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc].decodeBody(_buffer);
            }
        }

    }

    public class Remove extends Type
    {

        public soupply.bedrock274.type.McpeUuid[] players;

        public Remove()
        {
        }

        public Remove(soupply.bedrock274.type.McpeUuid[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 1;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(soupply.bedrock274.type.McpeUuid cxevc:players)
            {
                cxevc.encodeBody(_buffer);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new soupply.bedrock274.type.McpeUuid[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc].decodeBody(_buffer);
            }
        }

    }

}
