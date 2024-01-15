package Personal;

import java.util.ArrayList;
import java.util.List;

public class JesusTraining
{

    public static void main(String[] args)
    {


        ArrayList<Animal> animalList = new ArrayList<>();
        Dog dog1 = new Dog();
        dog1.setName("Ron");
        dog1.setRace("Beagle");

        Cat cat1 = new Cat();
        cat1.setName("Pekoms");
        cat1.setRace("Black Cat");

        animalList.add(dog1);
        animalList.add(cat1);


        for(Animal animal:animalList)
        {
            animal.displayInfo();
            System.out.println(animal.getClass().toString()+"\n");
        }


        f(cat1);



    }

    public static void f(Animal animal)
    {
        Animal animal1 = animal;
        animal.displayInfo();


    }


}
