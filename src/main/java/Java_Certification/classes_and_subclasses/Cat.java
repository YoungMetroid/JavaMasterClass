package Java_Certification.classes_and_subclasses;

public interface Cat {

    static int legs = 4;
    static void objectType(){System.out.println("Interface Cat");}
    default int legCount() {return legs;}
    static int originalLegCount() { return legs;}
     abstract public String getBreed();
    public void meow();
}
