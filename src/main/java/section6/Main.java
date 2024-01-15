package section6;

import javax.swing.*;

public class Main {
    public static void main(String[]args){

        Animal  animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Ody", 2,10,1,4,1,20,"Silky");
        dog.eat();
        dog.walk();
        dog.run();
        Object obj = dog.getClass();
        System.out.println(obj);

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("East");
        Ceiling ceiling = new Ceiling(4,255);
        Bed bed = new Bed("Modern", 2,3,1,1);
        Lamp lamp = new Lamp("Classic", false, 100);

        Bedroom bedroom = new Bedroom("Felipe",wall1,wall2, wall3, wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();




    }
}
