package LeetCode;

public class TestingStaticProperties {

    private static String name;
    public static String lastName;

    public TestingStaticProperties()
    {

    }

    public void setName(String name)
    {
        TestingStaticProperties.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name + " " + "LastName: " + lastName);
    }
}
