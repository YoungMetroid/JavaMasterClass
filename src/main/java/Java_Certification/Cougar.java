package Java_Certification;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cougar
{
        public static void main(String[] args)
        {


            double tuesday = 5__6L;
            System.out.println(tuesday);

            List<Tadpole> tadpoles = new ArrayList<Tadpole>();
            for (Amphibian amphibian : tadpoles)
            {
                Amphibian tadpole = amphibian;
            }
            int x=5;
            int j=0;
            OUTER: for (int i = 0; i < 3;)
                INNER: do {
                      i++;
                       x++;
                       if (x> 10) break INNER;
                      x += 4;
                      j++;
                     } while (j <= 2);
                   System.out.println(x);
        }
}




interface CanSwim {}
 class Amphibian implements CanSwim {}
   abstract class Tadpole extends Amphibian {}
     class FindAllTadPole {}
