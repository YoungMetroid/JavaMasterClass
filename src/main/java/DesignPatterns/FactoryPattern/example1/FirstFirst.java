package DesignPatterns.FactoryPattern.example1;

public class FirstFirst extends Namer
{
    public FirstFirst(String s)
    {
        int i = s.lastIndexOf(" ");
        if(i>0)
        {
            first = s.substring(0,i).trim();
            last = s.substring(i+1).trim();
        }
        else
        {
            first = "";
            last = s;
        }
    }
}
