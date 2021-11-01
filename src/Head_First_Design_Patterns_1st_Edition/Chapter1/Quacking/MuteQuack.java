package Head_First_Design_Patterns_1st_Edition.Chapter1.Quacking;

public class MuteQuack implements QuackBehavior
{
    public void quack()
    {
        System.out.println("<<Silence >>");
    }
}
