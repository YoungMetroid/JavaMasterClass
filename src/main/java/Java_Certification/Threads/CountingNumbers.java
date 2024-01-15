package Java_Certification.Threads;

public class CountingNumbers {


    private int currentNum = 0;

    private int repeatLimit = 5;
    private static CountingNumbers countingNumbers;

    public synchronized void Increment(String info){

        currentNum++;
        System.out.println(info + "incremented to: " + currentNum);
        if(currentNum >= 100 && repeatLimit > 0)
        {
            currentNum = 0;
            repeatLimit--;
        }

    }
    public synchronized int getCount(){
        return currentNum;
    }
    private CountingNumbers() {

    }

    public synchronized static CountingNumbers getInstance() {

        if(countingNumbers == null)
        {
            countingNumbers = new CountingNumbers();
        }
        return countingNumbers;
    }
}
