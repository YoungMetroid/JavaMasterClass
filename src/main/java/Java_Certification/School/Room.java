package Java_Certification.School;

public class Room implements Student {
    public int seats  = 20;

    @Override
    public int getPencil() {
        return 2;
    }
}
