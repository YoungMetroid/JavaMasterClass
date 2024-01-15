package Java_Certification.classes_and_subclasses;

import java.util.Arrays;

public class Games {
    static int x = 10;
    int y;
    public final static void main(String [] args)
    {

      GameInfoI n64I = new Nintendo64();
      //n64I.printCost() is not possible because to access static methods in a interface you
      // have to use the Class name GameInfoI.printCost() and this will print the defined value
      // even is you have a method with the same define basically overriden the method you really
        //aren't overriden anything. Since static methods in a inferace can only be accessed
        //like mentioned before.

        GameInfoII gamesInfoI = new GameInfoII(){};
        gamesInfoI.cost();
        System.out.println(x);
        System.out.println(new Games().x);
        System.out.println(Games.x);
        GameInfo ps1 =  new PlayStationGame();
        ps1.printMultiplayer();
        ps1.printCost();


        //Escenario I
        Nintendo64 n64 = new Nintendo64();
        n64.Nintendo64();
        n64.printCost();


        GameCube gc = (GameCube) n64;
       gc.printCost();



        // In this particular case we see 2 things happen
        // The first being that a polymorphism is applied to the printMultiplayer method The method is
        // Overridden so only 1 player is printed
        // In the second polymorphism is not applied since it does not apply to static methods. In this case calling
        // a overriden method (method hiding) with a super class reference will cause the superclass method to be called. So 60 is
        // is printed and not 40.
        }
}

    interface GameInfoI {
        int c =100;
        String s = "s";
        static  void printCost() {
            System.out.println(60);
        }
        public default void cost(){
            System.out.println(60);
        }
        public default void pp(int a ,int b ){}
    }
    interface GameInfoII{
        default void cost(){
            System.out.println(70);
        }
    }

    class Nintendo64 implements GameInfoI{

        public void Nintendo64()
        {

        }
        void pp2(){}

        public static void printCost(){
                System.out.println(50);
            }
        public void method()
        {
            System.out.println("Nintendo 64");
        }

    }
    class GameCube extends Nintendo64 implements GameInfoI{
        public static void printCost(){
            System.out.println(100);
        }
        public void method()
        {
            System.out.println("GameCube");
        }
    }


    class GameInfo{
        static void printCost()
        {
            System.out.println(60);
        }
        void printMultiplayer()
        {
            System.out.println(4);
        }
    }

    class PlayStationGame extends GameInfo
    {
        public static  void printCost()
        {
            System.out.println(40);
        }
         void printMultiplayer()
        {
            System.out.println(1);
        }
    }


