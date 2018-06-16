package soupply.java.type;

import java.util.*;
import soupply.util.*;

class Attribute extends Type
{

    public String key;
    public double value;
    public soupply.java.type.Modifier[] modifiers;

    public Attribute()
    {
        this.modifiers = new soupply.java.type.Modifier[]();
    }

    public Attribute(String key, double value, soupply.java.type.Modifier[] modifiers)
    {
        this.key = key;
        this.value = value;
        this.modifiers = modifiers;
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