package section4;

public class megaBytesConverter {

    public static void main(String args[])
    {
        printMegaBytesAndKiloBytes(2000);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(3000);
        printMegaBytesAndKiloBytes(2049);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes >= 0 )
        {
            int megaBytes = Math.round( kiloBytes/ 1024);
            int remaining = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaining + " KB");
        }
        else {
            System.out.println("Invalid Value");
        }

    }
}
