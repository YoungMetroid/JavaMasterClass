package DesignPatterns.FactoryPattern.example1;

public class LastFirst extends Namer
{
    public LastFirst(String s)
    {
        int index = s.indexOf(",");
        if(index > 0)
        {
            last = s.substring(0,index).trim();
            first = s.substring(index+1).trim();
        }
        else
        {
            last = s;
            first = "";
        }
    }

}
