package Head_First_Design_Patterns_1st_Edition.Chapter1.Ducks;

import Head_First_Design_Patterns_1st_Edition.Chapter1.Flying.FlyBehavior;
import Head_First_Design_Patterns_1st_Edition.Chapter1.Quacking.QuackBehavior;

public abstract  class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public Duck()
    {

    }

    public abstract  void display();


    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
}
