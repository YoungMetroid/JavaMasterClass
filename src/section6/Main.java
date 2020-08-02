package section6;

public class Main {
    public static void main(String[]args){

        Animal  animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Ody", 2,10,1,4,1,20,"Silky");
        dog.eat();
        dog.walk();
        dog.run();
        Object obj = dog.getClass();
        System.out.println(obj);
    }
}
