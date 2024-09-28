package Java_Certification.Initialization;

public class TestIntializationOrder {

    {
        System.out.println("Testing the order");
    }

    public TestIntializationOrder(){
        System.out.println("TestInitializationOrder");
    }

}


class SubClass extends TestIntializationOrder{
    static{
        System.out.println("1");
    }
    static{
        forLoop();
    }
    static boolean flag = false;
    static {
        forLoop();
    }

    {
        System.out.println("Normal Block");
    }
    {
        print();
    }
    {
        forLoop();
    }
    //This should be the order
    // 1, Flag: false,Flag: false,
    // Testing the order, TestInitializationOrder, Normal Block, ?, Flag: true, SubClass
    //

    static public void forLoop(){
        System.out.println("Flag: " + flag);
        flag = true;
    }

    public SubClass(){
        super();
        System.out.println("SubClass");
    }

    public void print(){
        System.out.println("?");
    }
    public static void main(String ... args){

        new SubClass();
        float f = 12.0f;
        double d = f++;
        d -= 0.3;

    }
}
