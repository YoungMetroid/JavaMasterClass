package section4;

public class speedConverter {

    public static void main(String args[])
    {
        System.out.println(speedConverter(3.5));
    }
    public static double speedConverter(double kilometersPerhour)
    {
        if(kilometersPerhour < 0)
        {
            return  0;
        }
        return kilometersPerhour / 1.609;
    }
}
