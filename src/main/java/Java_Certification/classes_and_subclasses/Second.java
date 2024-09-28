package Java_Certification.classes_and_subclasses;

public class Second extends First {

    public static void main(String[] args){
        First f = new Second();
        f.change();
        System.out.println(f.j);

    }
}
