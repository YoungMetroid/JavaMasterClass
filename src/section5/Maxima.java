package section5;

public class Maxima extends Car{
    private int roadService;

    public Maxima(boolean isManual, int roadService) {
        super("Maxima", "4WD", 4, 4, 6, isManual);
        this.roadService = roadService;
    }
}
