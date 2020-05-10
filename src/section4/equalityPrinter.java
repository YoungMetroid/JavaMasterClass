package section4;

public class equalityPrinter {

    public static void main(String args[])
    {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(1,2,3);
        printEqual(1,1,0);
        printEqual(1,1,-1);
    }
    public static void printEqual(int one, int second, int third)
    {
        if(one < 0 || second < 0 || third < 0)
            System.out.println("Invalid Value");
        else if(one == second && one == third)
            System.out.println("All numbers are equal");
        else if(one != second && one != third && second != third)
            System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different ");

    }
}
