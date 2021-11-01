package Head_First_Design_Patterns_1st_Edition.Chapter1.Quacking;

import Head_First_Design_Patterns_1st_Edition.Chapter1.Quacking.QuackBehavior;

public class Squeak implements QuackBehavior {

    public void quack()
    {
        System.out.println("Squeak");
    }
}
