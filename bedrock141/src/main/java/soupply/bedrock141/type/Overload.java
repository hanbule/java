package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Overload extends Type
{

    public soupply.bedrock141.type.Parameter[] parameters;

    public Overload()
    {
    }

    public Overload(soupply.bedrock141.type.Parameter[] parameters)
    {
        this.parameters = parameters;
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
