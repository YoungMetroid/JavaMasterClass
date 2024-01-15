package section6;

public class MainSection6 {

    public static void main(String []args){
        Dimensions dimensions = new Dimensions(20,40,10);
        Case theCase = new Case("2020", "Dell","600w", dimensions);

        Monitor monitor = new Monitor("27inch","Benq",27,new Resolution(1080,1920));

        MotherBoard motherBoard = new MotherBoard("X570 Aorus" ,"Gigabyte", 4,2,"v2.44" );

        PC thePc = new PC(theCase,monitor,motherBoard);
        thePc.powerUp();

    }
}
