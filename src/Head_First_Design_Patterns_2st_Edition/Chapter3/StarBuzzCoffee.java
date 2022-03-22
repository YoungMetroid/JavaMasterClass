package Head_First_Design_Patterns_2st_Edition.Chapter3;

import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverages.DarkRoast;
import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverages.Espresso;
import Head_First_Design_Patterns_2st_Edition.Chapter3.CondimentDecorators.Mocha;
import Head_First_Design_Patterns_2st_Edition.Chapter3.CondimentDecorators.Soy;

public class StarBuzzCoffee
{

    public static void main(String[] args)
    {
        Beverage beverage = new Espresso();

        System.out.println(beverage.description + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
