package Java_Certification.ExceptionTesting;

import java.io.FileNotFoundException;

public class Animals {


    public static void main(String [] args){

       Animal animal = new Dog();
       animal.eat();


       Dog dog = new Dog();
       dog.eat();

       Wolf wolf = new Huskey();
       wolf.eat();

       Huskey huskey = new Huskey();
       huskey.eat();

        //A try catch is needed here because the Cat object throws a exception even though
        // The instance is of type tiger which does not throw the exception.
       try {
           Cat cat = new Tiger();
           cat.eat();
       }
       catch (Exception ex)
       {
           ex.printStackTrace();
       }

       Tiger tiger = new Tiger();
       tiger.eat();
    }



    public static class Animal{
        public void eat(){
            System.out.println("Animals");
        }
    }

    public static class Dog extends Animal{
        public void eat(){
            System.out.println("Dog eats");
        }
    }

    public static abstract class Wolf{
        public void eat(){
            System.out.println("Wolf eats");
        }
    }
    public static class Huskey extends Wolf{
        public void eat(){
            System.out.println("Huskey eats");
        }
    }

    public static abstract class Cat{
        public void eat()throws Exception{
            System.out.println("Cat eats");
        }
    }
    public static class Tiger extends Cat{
        public void eat() {
            System.out.println("Tiger eats");
        }
    }

    public static class Lion extends Cat{
        public void eat()throws FileNotFoundException {
            System.out.println("");
        }
    }

}
