package Java_Certification.StudyGuide;

public class StaticKeyWordUsage {
    private static int one =1;
    static { two =2;}
    private static int two;

    public static int three = 1;
    int four;
    {
        System.out.println("four:"+four);
    }

    static String s;
    static Integer integer;
    Integer integer2;
    static int [] arr;

    static int [] arr2 = new int[two];

    static int [][]doubleArray;
    static int [][]doubleArray2 = new int [3][];
    final int []doubleArray3 = new int [3];
    public static void main(String []args){
        int test = 2;
        System.out.println(three + add(2));
        StaticKeyWordUsage staticKeyWordUsage = new StaticKeyWordUsage();
        staticKeyWordUsage.doubleArray3[0] = 1;
        staticKeyWordUsage.print(test);
    }
    StaticKeyWordUsage(){
        System.out.println("Constructor");
        three++;
    }
    public void print(int i){
        System.out.println(i);
        System.out.println(three);
        test(true);
    }
    public static void test(boolean flag ){
        int zero =0;
        System.out.println("test");


        System.out.println(zero);

    }
    public static int add(int i){

        int value  = new StaticKeyWordUsage().three +i;
        System.out.println(new StaticKeyWordUsage().three + three);
        System.out.println( StaticKeyWordUsage.three + three);
        return new StaticKeyWordUsage().three+1;

    }
}
