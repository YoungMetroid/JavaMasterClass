package Java_Certification.StudyGuide;

public class FinalKeyWordUsage {
    {seven=0;}
    private static final int one =1;
    private static final int two;
    static { two =2;}
    private final int three = 0;
    {four =0;}
    public int four;
    public final int five;
    public int six;

    public final int seven;


    public static void main(String []args){
        final int test;
        FinalKeyWordUsage finalKeyWordUsage =new FinalKeyWordUsage();


        new FinalKeyWordUsage().print(10);
    }
    FinalKeyWordUsage(){
        five =5;
    }
    public void print(int i){

        final int eight;
        //System.out.println(eight); This will cause a compiler error

        System.out.println(i);
    }
}
