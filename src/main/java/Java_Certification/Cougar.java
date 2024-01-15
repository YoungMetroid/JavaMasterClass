package Java_Certification;


import java.util.ArrayList;
import java.util.function.Predicate;

public class Cougar
{
        public static void main(String[] args)
        {


            double tuesday = 5__6L;
            System.out.println(tuesday);

            var tadpoles = new ArrayList<Tadpole>();
            for (Amphibian amphibian : tadpoles)
            {
                Amphibian tadpole = amphibian;
            }
            var x=5;
            var j=0;
            OUTER: for (var i = 0; i < 3;)
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
