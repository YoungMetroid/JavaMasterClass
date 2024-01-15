package DesignPatterns.FactoryPattern.example1;

public class NameFactory
{
    public Namer getNamer(String entry)
    {
        int index = entry.indexOf(",");

        if(index > 0)
        {
            return new LastFirst(entry);
        }
        else
        {
            return new FirstFirst(entry);
        }
    }

    public static void main(String[] args)
    {
        NameFactory nameFactory = new NameFactory();

        for(String name: args)
        {
            Namer namer = nameFactory.getNamer(name);
            System.out.println("First Name: " + namer.getFirst());
            System.out.println("Last Name: " + namer.getLast());
        }
    }
}
