package section4;

public class barkingDog {

    public static void main(String args[])
    {
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(false, 7));
        System.out.println(shouldWakeUp(false, -1));
        System.out.println(shouldWakeUp(false, 0));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(hourOfDay >= 0 && hourOfDay <= 23)
        {
            if((hourOfDay == 23 || hourOfDay < 8) && barking == true )
                return true;
        }
       return false;
    }
}
