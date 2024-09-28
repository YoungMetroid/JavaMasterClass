package Java_Certification.StudyGuide;

public abstract interface StudyInterface {

    public static int value =0;
    static final int value2 = 0;//All variables are final static in interfaces;

    default int getDefaultValue(){return value;}

    static int getStaticValue(){ return 0;}


    int getImplementedValue();
    int getNewValue();
}
