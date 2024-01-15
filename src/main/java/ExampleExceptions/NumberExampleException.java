package ExampleExceptions;

public class NumberExampleException {

    public NumberExampleException()
    {

    }

    public double ConverString_To_Decimal(String number) throws NumberFormatException
    {
        return Double.valueOf(number);
    }
}
