package Head_First_Design_Patterns_2st_Edition.Chapter1.Ducks;

import Head_First_Design_Patterns_2st_Edition.Chapter1.Flying.FlyWithWings;
import Head_First_Design_Patterns_2st_Edition.Chapter1.Quacking.Quack;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display()
    {
        System.out.println("I'm a real Mallard duck");
    }
}
