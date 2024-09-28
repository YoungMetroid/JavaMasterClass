package Java_Certification.ExceptionTesting;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animals {


    public static void main(String [] args){

       Animal animal = new Dog();
       animal.eat();
       animal.sleep();


       Dog dog = new Dog();
       dog.sleep();
       dog.eat();

        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(dog,animal));
        animalList.forEach(Animal::sleep);

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
        protected void sleep(){
            System.out.println("Animal is sleeping");
        }
    }

    public static class Dog extends Animal{
        public void eat(){
            System.out.println("Dog eats");
        }
        @Override
        protected  void sleep(){
            System.out.println("Dog is sleeping");
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
