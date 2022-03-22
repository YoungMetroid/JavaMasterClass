package Head_First_Design_Patterns_2st_Edition.Chapter3.CondimentDecorators;

import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverage;
import Head_First_Design_Patterns_2st_Edition.Chapter3.CondimentDecorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator
{
    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }
    public BigDecimal cost()
    {
        return beverage.cost().add(new BigDecimal(".20"));
    }
}
