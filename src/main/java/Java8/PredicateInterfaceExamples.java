package Java8;

import java.util.function.Predicate;


public class PredicateInterfaceExamples
{

    public static void main(String[] args)
    {
        Predicate<String> greaterThan = i -> "10".equals(i);
        //System.out.println(greaterThan.test(0));
        System.out.println(greaterThan.test("11"));


        MyComparator addEverything = arr -> {
                int sum = 0;
                for(Integer element :arr){
                    sum += element;
                }
                return sum;
        };
        int result = addEverything.add(new Integer[]{1,2,3,4});
        System.out.println("Comparison result: " + result);

        SlowStringComparator<String> slowStringComparator = (s1,s2)->{
            if(s1.length() == s2.length()){
                return "They have the same length";
            }
            else{
                return "They have a different length";

            }
        };
        String comparisonResult = slowStringComparator.compare("banana","apple");
        System.out.println(comparisonResult);
    }
}
