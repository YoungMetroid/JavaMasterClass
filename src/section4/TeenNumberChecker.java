package section4;

public class TeenNumberChecker {

    public static void main(String[] args)
    {
        System.out.println(hasTeen(1,13,99));
        System.out.println(hasTeen(1,20,25));
        System.out.println(hasTeen(1,19,1));
        System.out.println(hasTeen(1,15,1));
        System.out.println(isTeen(15));
        System.out.println(isTeen(12));
    }
    public static boolean hasTeen(int first, int second, int third)
    {
        if(first >= 13 && first <= 19) return true;
        if(second >= 13 && second <= 19) return true;
        if(third >= 13 && third <= 19) return true;
        return false;

    }
    public static boolean isTeen(int teen)
    {
        if(teen >= 13 && teen <= 19) return true;
        return false;
    }
}
