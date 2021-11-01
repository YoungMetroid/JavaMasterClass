package Head_First_Design_Patterns_1st_Edition.Chapter1.Ducks;

import Head_First_Design_Patterns_1st_Edition.Chapter1.Flying.FlyNoWay;
import Head_First_Design_Patterns_1st_Edition.Chapter1.Quacking.Quack;

public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a model duck");
    }
}
