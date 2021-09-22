package section6.challenge;

public class Main {

    public static void main(String []args){

        Printer printer = new Printer("HP",100,false);

        System.out.println("Number of pages printed " + printer.getPagesPrinted());
        System.out.println("The toner leve is " + printer.getTonerLevel());

        printer.PrintPages(50);
        System.out.println("Number of pages printed " + printer.getPagesPrinted());
        System.out.println("The toner leve is " + printer.getTonerLevel());
        printer.FillUpToner(100);
        System.out.println("Number of pages printed " + printer.getPagesPrinted());
        System.out.println("The toner leve is " + printer.getTonerLevel());

    }
}
