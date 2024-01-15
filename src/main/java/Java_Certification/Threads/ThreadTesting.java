package Java_Certification.Threads;

public class ThreadTesting extends Thread{



    public static void main(String ... args){

        CountingNumbers countingNumbers  = CountingNumbers.getInstance();

        ThreadTesting threadTesting1 = new ThreadTesting("Thread1");
        ThreadTesting threadTesting2 = new ThreadTesting("Thread2");
        ThreadTesting threadTesting3 = new ThreadTesting("Thread3");
        ThreadTesting threadTesting4 = new ThreadTesting("Thread4");

        threadTesting1.start();
        threadTesting2.start();
        threadTesting3.start();
        threadTesting4.start();
    }

    public ThreadTesting(String name){
        super(name);
    }

    public void run(){

        System.out.printf("Thread %s is running", this.getName());
        CountingNumbers countingNumbers = CountingNumbers.getInstance();

        while(true)
        {
            synchronized (countingNumbers) {
                if (countingNumbers.getCount() < 100)
                    countingNumbers.Increment(this.getName());
                else break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Terminating %s \n", this.getName());
    }
}
