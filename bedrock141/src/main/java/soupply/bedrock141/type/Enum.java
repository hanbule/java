package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Enum extends Type
{

    public String name;
    public short[] valuesIndexes;

    public Enum()
    {
    }

    public Enum(String name, short[] valuesIndexes)
    {
        this.name = name;
        this.valuesIndexes = valuesIndexes;
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
