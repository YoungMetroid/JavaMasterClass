package Java_Certification.classes_and_subclasses;

public interface Cat {

    static void objectType(){System.out.println("Interface Cat");}
    default int legCount() {return 4;}
    public String getBreed();
    void meow();
}
