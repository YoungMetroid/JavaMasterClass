package Head_First_Design_Patterns_2st_Edition.Chapter3.Beverages;

import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage
{
    public Espresso()
    {
        description = "Espresso";
    }
    public BigDecimal cost() {return new BigDecimal("1.99"); }
}
