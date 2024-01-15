package section4;

public class threeDecimalPlaces {
    public static void main(String[] args)
    {
        System.out.println(areEqualByThreeDecimalPlaces(0.0,0.0));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber)
    {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);

        String[] firstArray = first.split("\\.");
        String[] secondArray = second.split("\\.");

        if(firstArray[0].equals(secondArray[0]))
        if(firstArray[1].length() == secondArray[1].length() || (firstArray[1].length() >=3  && secondArray[1].length() >=3))
        {
            for(int counter = 0; counter < firstArray[1].length() && counter < 3; counter++)
            {
                if(firstArray[1].charAt(counter) != secondArray[1].charAt(counter))
                    return false;
            }
            return true;
        }
        return false;
    }
}
