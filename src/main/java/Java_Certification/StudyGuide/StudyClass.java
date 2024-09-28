package Java_Certification.StudyGuide;

public class StudyClass implements StudyInterface{


    public static void main(String []args){

        StudyInterface s = new StudyClass();

        System.out.println(s.getDefaultValue());
        System.out.println(StudyInterface.getStaticValue());
        System.out.println(s.getImplementedValue());

        StudyClass studyClass = new StudyClass();
        StudyInterface sI = studyClass;

        System.out.println(sI.getDefaultValue());
        System.out.println(sI.getImplementedValue());

    }

    @Override
    public int getImplementedValue() {
        return 1;
    }

    @Override
    public int getNewValue() {
        return 0;
    }

    @Override
    public int getDefaultValue(){
        return 5;
    }
    public int getStaticValue(){
        return 10;
    }




}
