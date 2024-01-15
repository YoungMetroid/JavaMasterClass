package Head_First_Design_Patterns_2st_Edition.Chapter3;

public abstract class CondimentDecorator extends Beverage
{
    protected Beverage beverage;
    public abstract String getDescription();

}
