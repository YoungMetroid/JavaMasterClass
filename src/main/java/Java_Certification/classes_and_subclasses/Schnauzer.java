package Java_Certification.classes_and_subclasses;

public class Schnauzer extends AnimalTest {

    final String specie = "Dog";
    @Override
    int getLegs() {
        return 4;
    }

    @Override
    String getSpecie() {
        return specie;
    }

    @Override
    String getSound() {
       return "Woof woof";
    }

    @Override
    void getInfo() {
        System.out.println("Specie is: " + specie);
        System.out.println("Leg Count : " + getLegs());
        System.out.println("Sound : " + getSound() + " pero mas chafa");
    }
}
