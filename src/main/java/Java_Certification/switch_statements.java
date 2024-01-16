package Java_Certification;

public class switch_statements {

    public static void main(String ... args)
    {

        // In this example you can also set the switch to accept
        // different types like ints and chars.
        int dayOfweek = 7;
        char one = '1';
        switch (one)
        {
            case '1':
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
default:
                System.out.println("Weekday");

            break;
        }
    }
}
