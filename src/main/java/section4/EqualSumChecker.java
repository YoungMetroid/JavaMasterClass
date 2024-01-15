package section4;

public class EqualSumChecker {
    public static void main(String[] args)
    {
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(5,5,11));
    }
    public static boolean hasEqualSum(int first, int second, int sum)
    {
        if((first + second) == sum) return true;
        return false;
    }
}
