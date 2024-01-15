package Java_Certification;

public class Account {
    private String accountNumber;
    public static void main(String[]args)
    {
        System.out.println("Hello 1 2 3 testing");
        String [] letters = new String []{"abcd"};
        letters(letters);
        System.out.println(letters[0]);
    }
    public static String[] letters(String []letters)
    {
        letters[0] += "e";
        return letters;
    }
}
