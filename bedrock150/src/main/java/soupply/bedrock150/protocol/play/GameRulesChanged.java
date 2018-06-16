package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock150.Packet
{

    public static final int ID = 72;

    public soupply.bedrock150.type.Rule[] rules;

    public GameRulesChanged()
    {
        this.rules = new soupply.bedrock150.type.Rule[]();
    }

    public GameRulesChanged(soupply.bedrock150.type.Rule[] rules)
    {
        this.rules = rules;
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