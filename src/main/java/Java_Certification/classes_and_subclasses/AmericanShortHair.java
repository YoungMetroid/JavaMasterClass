package Java_Certification.classes_and_subclasses;

public class AmericanShortHair implements Cat{
    public Color color;
    private int legCount;
    @Override
    public String getBreed() {
        return "American ShortHair";
    }

    @Override
    public void meow() {
        System.out.println("Meorw");
    }

    public AmericanShortHair(int legs)
    {
        legCount = legs;
    }
    public AmericanShortHair()
    {
        legCount = 4;
    }
    @Override
    public int legCount()
    {
        return legCount;
    }

    public static void main(String[]args)
    {

        Cat.objectType();
        Cat ash = new AmericanShortHair(3);
        AmericanShortHair ame = new AmericanShortHair();
        ame.color = Color.red;
        System.out.println(ame.color);
        System.out.println(ash.getBreed());
        ash.meow();
        System.out.println(ash.legCount());



        Device device = new MiniDevice();
        Device device2 = new Device();

        if( device instanceof Electronic)System.out.println("A");
        if( device2 instanceof Object)System.out.println("B");
        if( device2 instanceof MiniDevice)System.out.println("C");

    }



}
enum Color{
    red,blue;
}
interface Electronic{

}
class Device implements Electronic{}
class MiniDevice extends Device{}
