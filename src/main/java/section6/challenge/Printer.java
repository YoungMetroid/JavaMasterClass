package section6.challenge;

public class Printer {
    private String name;
    private int tonerLevel;
    private int pagesPrinted =0;
    private boolean duplexPrinter;

    public Printer(String name, int tonerLevel, boolean duplexPrinter) {
        this.name = name;
        this.tonerLevel = tonerLevel;
        this.duplexPrinter = duplexPrinter;
    }

    public void FillUpToner(int tonerLevel){
        if(tonerLevel > 0){
            this.tonerLevel += tonerLevel;
            if(this.tonerLevel > 100 ) this.tonerLevel = 100;
        }
    }
    public void PrintPages(int numberofPages){
        if(numberofPages > 0 && numberofPages <= tonerLevel)
        {
            pagesPrinted += numberofPages;
            tonerLevel = tonerLevel - numberofPages;
        }
    }
    public void getDuplexPrinter(){
        System.out.println("This is a Duplex Printer: " + duplexPrinter);
    }
    public int getTonerLevel(){
        return this.tonerLevel;
    }
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
