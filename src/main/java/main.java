import java.util.ArrayList;
import java.util.List;

public class main
{
    public static void main(String[] args)
    {
/*
        F = "X.Y.Z" # 1.0.3

        J = "A.B.C" # 1.1.0

        checkUpdate(localVersion, remoteVersion):
        return True if remoteVersion > localVersion
        False otherwise

 */

        //100.10.5
        //100.09

      // boolean isGreater =  checkUpdate("2.0.3", "1.1.0");
        System.out.println(fib(1));
        System.out.println(fibR(1));

        System.out.println(fib(2));
        System.out.println(fibR(2));

        System.out.println(fib(3));
        System.out.println(fibR(3));

        System.out.println(fib(4));
        System.out.println(fibR(4));

        System.out.println(fib(5));
        System.out.println(fibR(5));

        System.out.println(fib(10));
        System.out.println(fibR(10));
    }
    public static boolean checkUpdate(String localVersion, String remoteVersion){

        List<Integer> local = new ArrayList<>();
        List<Integer> remote= new ArrayList<>();

        String num = "";
        //local = getVersion(localVersion);
        //remote= getVersion(remoteVersion);


        for(int i = 0; i< local.size(); i++){

            if(local.get(i) < remote.get(i)){
                return true;
            }
            else if(local.get(i) > remote.get(i)){
                return false;
            }
        }
        return false;
    }

   public static int fib(int n){

        int prev = 0;
        int next = 1;
        if(n == 0 ) return 0;
        if(n == 1) return 1;

        int i = 1;
        int sum = 0;
        while(i < n){

            sum = prev + next;
            prev = next;
            next = sum;
            i++;
        }

        return sum;
   }
   public static int fibR(int n ){

        if(n <= 1){
            return n;
        }

        return fibR(n-1) + fibR(n-2);
   }


}
