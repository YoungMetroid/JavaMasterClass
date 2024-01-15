package section5;

public class Maxima extends Car{
    private int roadService;

    public Maxima(boolean isManual, int roadService) {
        super("Maxima", "4WD", 4, 4, 6, isManual);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity  = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }
        else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }
        else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }
        else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }
        else changeGear(4);

        if(newVelocity > 0 ){
            changeVelocity(newVelocity,getCurrentDirection());
        }


    }
}
