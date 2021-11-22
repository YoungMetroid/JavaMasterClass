package Java8;

import java.util.function.Predicate;

public class PredicateInterfaceExamples
{

    public static void main(String[] args)
    {
        Predicate<String> greaterThan = i -> i.equals("10");


        //System.out.println(greaterThan.test(0));

        System.out.println(greaterThan.test("11"));
    }
}
