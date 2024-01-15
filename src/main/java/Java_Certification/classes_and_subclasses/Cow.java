package Java_Certification.classes_and_subclasses;

import Java_Certification.ExceptionTesting.Animals;

import java.util.ArrayList;
import java.util.List;

public class Cow extends AnimalTest {

    final String specie = "Cow";
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
        return "Moooo";
    }

    @Override
    void getInfo() {
        System.out.println("Specie is: " + specie);
        System.out.println("Leg Count : " + getLegs());
        System.out.println("Sound : " + getSound());
    }

    void patadaVoladora(){
        System.out.println("cuidado con eso");
    }


    public static void main(String [] args)
    {
        Cow cow = new Cow();
        Schnauzer schnauzer = new Schnauzer();

        List<AnimalTest> animalsTestList = new ArrayList<>();

        animalsTestList.add(cow);
        animalsTestList.add(schnauzer);

        for (AnimalTest test: animalsTestList)
        {
            test.getInfo();
            if(test instanceof Cow)
            {
                ((Cow)test).patadaVoladora();
            }
        }


    }
}
