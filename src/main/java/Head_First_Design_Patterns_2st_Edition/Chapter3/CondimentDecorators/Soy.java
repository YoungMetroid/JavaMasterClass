package Head_First_Design_Patterns_2st_Edition.Chapter3.CondimentDecorators;

import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverage;
import Head_First_Design_Patterns_2st_Edition.Chapter3.CondimentDecorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator
{
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Soy";
    }
    public BigDecimal cost()
    {
        return beverage.cost().add(new BigDecimal(".15"));
    }
}
