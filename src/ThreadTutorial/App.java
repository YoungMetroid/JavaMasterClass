package ThreadTutorial;

class CA
{

}

//MyTask IS-A Thread
class MyTask extends CA implements Runnable {
    @Override
    public void run()
    {
        for(int doc =1; doc<=10; doc++)
        {
            System.out.println("@@ Printing Document #" + doc + " -Printer2");
        }
    }
}

public class App
{
    // main method represents main thread
    public static void main(String[]args)
    {
        //whatever we write in here will be executed by main thread
        //threads always execute the jobs in a sequence
        //Execution Context

        //Job1
        System.out.println("== Application Started ==");

        //Job2
        //MyTask task = new MyTask();
        //task.start();

        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();

        //Till Job2 is not finished, below written jobs are waiting and are not executed
        //In case Job2 is a long running operation, i.e. Several documents are suppose to be printed
        //In such a use case OS/JVM shal give a message that app is not responding
        //Some sluggish behaviour in app ca be observed -> App seems to hang

        //Now, main and MyTask are executing both parallely or concurrently !!


        //Job3
        //Some Code to print the documents
        for(int doc =1; doc<=10; doc++)
        {
            System.out.println("Printing Document #"+doc);
        }

        //Job3
        System.out.println("== Application Finished ==");
    }
}
