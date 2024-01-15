package Java_Certification.classes_and_subclasses;

import javax.security.auth.callback.TextOutputCallback;
import java.util.Arrays;
import java.util.*;
import java.util.jar.Manifest;

import static java.lang.Math.*;

 interface Dog{
    static int legs()
   {
       return 4;
   }
    default void bark()
    {
    System.out.println("Woof Woof");
    }
    void info();
}

 class Beagle implements Dog
{
    int legs()
    {
        return 3;
    }
    @Override
    public void info() {
        System.out.println("They smell everything");
    }
    @Override
    public void bark()
    {
        System.out.println("WOOOO WOOOO");
    }
}

public abstract class Reptile {

    Reptile(){
        System.out.println("Constructor");
    }

    Reptile(String s)
    {
        super();
    }
    abstract void info();
    public void layEggs()
    {
        System.out.println("Reptile laying eggs");
    }
    public static void main(String[] args) {
        Reptile reptile = new Lizard();
        reptile.layEggs();
        reptile.info();

    }
}

class Lizard extends Reptile
{

    Lizard()
    {
        super("Lizard");
    }
    Lizard(String s)
    {
        super(null);
        System.out.println(s);
    }
    public void layEggs()
    {
        System.out.println("Lizard laying eggs");
    }
    void info()
    {
        System.out.println("This is a lizard");
    }
}

class Bird{
     int age;
     String name;
    public void info() throws java.io.FileNotFoundException
    {
        System.out.printf("Don't know what type of bird i am");
    }
    private void info2(){};
}
class Toucan extends Bird{
     Toucan()
     {
         age = 1;
         name = "a";
     }
   public void info() throws RuntimeException{
        System.out.println("I have large orange beak");
    }
    public void info2()throws Exception{}
}
class Animals
{
    static int i;
    int j;
    Animals()
    {
        j = i++;
    };

    public static void main(String[] args) throws Exception
    {


        Animals s = new Animals();

        Animals s1 = new Animals();
        Animals s2 = new Animals();

        System.out.println(s.j);
        System.out.println(s.i);

        System.out.println(new Date());
        System.out.println(pow(5,5));
        int n = 80;
        System.out.format("%d",n);
        System.out.println();
        System.out.format("%04d",n);

        ///Even when casting, all the methods are from the Beagle instance
        // and not the Dog interface

        int [] a = {1,2,010,4};

        Arrays.sort(a, 0 ,4);

        System.out.println(a[2]);


        int [][] b = new int [3][];
        b[1] = new int[]{1,2,3};
        Dog dog = new Beagle();

        dog.bark();
        Beagle beagle = (Beagle)dog;
        beagle.bark();

        dog.info();
        System.out.println("The Beagle has " + ((Beagle)dog).legs() + " legs");
        System.out.println("A Dog  has " + Dog.legs() + " legs");


        Bird bird = new Toucan();

        bird.info();

        Toucan toucan = (Toucan) bird;
        toucan.info();

        Toucan toucan1 = new Toucan();
        Bird bird1 = toucan1;
        bird1.info();


        Reptile reptile = new Lizard();
        reptile.info();
        reptile.layEggs();

        Lizard lizard = new Lizard();

        Reptile lizard1 = lizard;


        lizard1.layEggs();
        lizard1.info();

        Reptile reptile1 = new Reptile() {
            @Override
            void info() {
                System.out.println("This is a reptile");
            }
        };

        reptile1.info();
        reptile1.layEggs();

        Lizard lizard2 = (Lizard)reptile1;
        lizard2.info();
        lizard2.layEggs();



    }
}

