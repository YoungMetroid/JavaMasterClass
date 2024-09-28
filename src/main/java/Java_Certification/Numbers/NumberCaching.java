package Java_Certification.Numbers;

public class NumberCaching {


    public static void main(String ... args){


        Short s1  = 127;
        Short s2  = 127;

        if(s1 == s2){
            System.out.printf("Caching mechanism ensures that %d and %d are the same\n\n"
            ,s1,s2);
        }

        Short s3 = 128;
        Short s4 = 128;
        Integer i1 = 128;
       
        if(s3 != s4){
            System.out.printf("Both %d and %d are saved in different object so the references are different\n" +
                            "This mean that they are not the same when using ==\n\n"
                    ,s3,s4);
        }

        if(s3.equals(s4)){
            System.out.printf("When using equals method on s3 and s4. They are equal since we are not comparing" +
                    "reference but the value and the type\n\n");
        }

        if(!s3.equals(i1)){
            System.out.printf("When using equals method on s3 and i1. They are never equal since equal compares " +
                    "value" +
                    "and type\n\n ");
        }

    }
}
