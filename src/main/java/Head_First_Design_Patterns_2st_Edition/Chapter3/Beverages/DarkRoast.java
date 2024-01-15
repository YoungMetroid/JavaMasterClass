package Head_First_Design_Patterns_2st_Edition.Chapter3.Beverages;

import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverage;

import java.math.BigDecimal;

public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        description = "DarkRoast";
    }
    public BigDecimal cost()
    {
        return new BigDecimal("0.99");
    }
}
