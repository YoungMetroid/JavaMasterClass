package Head_First_Design_Patterns_1st_Edition.Chapter1.Flying;

import Head_First_Design_Patterns_1st_Edition.Chapter1.Flying.FlyBehavior;

public class FlyNoWay implements FlyBehavior
{
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
