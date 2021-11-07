package Head_First_Design_Patterns_2st_Edition.Chapter1;

import Head_First_Design_Patterns_2st_Edition.Chapter1.Ducks.Duck;
import Head_First_Design_Patterns_2st_Edition.Chapter1.Ducks.MallardDuck;
import Head_First_Design_Patterns_2st_Edition.Chapter1.Ducks.ModelDuck;
import Head_First_Design_Patterns_2st_Edition.Chapter1.Flying.FlyRocketPowered;

public class MiniDuckSimulator
{

    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();;
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
