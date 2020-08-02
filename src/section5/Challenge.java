package section5;

public class Challenge {

    public static void main(String[]args){


        Maxima maxima = new Maxima(true,1);
        maxima.accelerate(30);
        maxima.steer(45);
        maxima.accelerate(20);
        maxima.accelerate(-40);
    }
}
