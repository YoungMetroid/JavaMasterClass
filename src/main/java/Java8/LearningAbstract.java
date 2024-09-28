package Java8;

public class LearningAbstract {
    public TestAbs createTestAbsInstance(){
        return new TestAbs() {
            @Override
            public void print() {
                System.out.println("Third way");
            }
        };
    }
    abstract public class TestAbs{
        abstract public void print();
        private void method(){
            System.out.println("This is private");
        }

        public void regularMethod(){
            System.out.println("Calling the private method");
        }
    }

    public static void main(String[] args){

        //First way of creating a anonymous classes
        //1- Create instance top class
        //2- Create the anonymous inner class using inner interaface or inner abstract class
        //
        TestAbs first = new LearningAbstract().new TestAbs() {
            @Override
            public void print() {
                System.out.println("First way of creating the anonymous class");
            }
        };
        first.print();

        LearningAbstract l  = new LearningAbstract();
        TestAbs second = l.new TestAbs(){
            @Override
            public void print() {
                System.out.println("Second way of creating the anonymous class");
            }
        };
        second.print();

        TestAbs third = new LearningAbstract().createTestAbsInstance();
        third.print();


    }
}
