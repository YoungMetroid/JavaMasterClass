package ExampleExceptions;
import java.io.PrintStream;

public class Main {

    public static void  main(String[]args)  {
        NumberExampleException numberExampleException = new NumberExampleException();

        try {
            PrintStream printStream = new PrintStream("exceptions.log");
            numberExampleException.ConverString_To_Decimal("f");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
