package Head_First_Design_Patterns_2st_Edition.Chapter3;

import java.math.BigDecimal;

public abstract class Beverage
{
    protected String description = "Unknown Beverage";

    public String getDescription(){return description;}
    public abstract BigDecimal cost();
}
