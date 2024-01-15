package section6;



public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        theCase.PressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(100,100,"Blue");
    }


}
