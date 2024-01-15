package Java_Certification.ExceptionTesting;


public class Outcome {

    static int x= 0;
    public static void main(String args[])
    {

        int x = 0b1;
        int y = 0xF;
              System.out.println( x/y);
        Outcome outcome = new Outcome();
        outcome.exceptionTest1(args);


        outcome.exceptionTest2();
    }



    public void exceptionTest1(String[] args)
    {
        try{
            System.out.println(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
        {
            if(e instanceof ArrayIndexOutOfBoundsException)
            {
                //e = new ArrayIndexOutOfBoundsException("Cannot reassign");
            }
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            e= new NullPointerException("Can Reassign here");
        }


    }


    // In this example we throw a NullPointerException but since is not caught in the catch block
    // The finally block is excuted and then the control returns to the main method.
    // In the main method will try to catch the Exception but if there is not try{}catch{} blocks
    // Then a runtime Exception will occur.
    public void exceptionTest2()
    {
        try{
            throw new NullPointerException();
        }
        catch (ClassCastException e)
        {
            System.out.println("Class Cast Exception");
        }
        finally {
            System.out.println("Final");
        }
        System.out.println("ExceptionTest2");
    }
}
class A {
    public Object supply(){
        return null;
    }
}
class B extends A{
    public Object supply() throws NullPointerException
    {
        return null;
    }
}
