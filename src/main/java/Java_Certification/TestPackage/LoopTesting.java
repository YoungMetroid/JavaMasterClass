package Java_Certification.TestPackage;

public class LoopTesting {




    public LoopTesting(String s){
        System.out.println("s");
    }

    static int array[][] = {{3,2,1},{5,4,2},{0,8,7}};

    public static void main(String[] args)
    {

        new LoopTesting(null);



        Double d = 10.D;
        double dd = 10.01213;
        float  f = 1.f;
        Float ff = 000f;
        int point = 1;
        System.out.println(point>= 0 ? "p":"n");
        outer:for(int x=0,k=0; x <3; x++)
        {

                k = 0;
                inner:while(true)
                {
                    System.out.println(array[x][k++]);
                    if(k == 3)
                       continue outer;
                }
        }

    }

}
