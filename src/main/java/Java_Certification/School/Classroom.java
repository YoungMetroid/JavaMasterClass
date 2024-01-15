package Java_Certification.School;

import java.util.Objects;

public class Classroom extends Room {

    public int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;
    public int seats = 10;

    public Classroom(int r, String t) {
        roomNumber = r;
        teacherName = t;


    }

}