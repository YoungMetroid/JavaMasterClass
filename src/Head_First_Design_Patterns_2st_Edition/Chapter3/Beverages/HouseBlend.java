package Head_First_Design_Patterns_2st_Edition.Chapter3.Beverages;

import Head_First_Design_Patterns_2st_Edition.Chapter3.Beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "House Blend Coffee";
    }

    public BigDecimal cost()
    {
        return new BigDecimal(".89");
    }
}
