package section6.encapsulation;

public class Main {

    public static void main(String []args){
        Player player = new Player();

        player.name = "Felipe";
        player.health = 100;
        player.weapon = "Sword";

        player.loseHealth(10);
        System.out.println("Health Remaining " + player.health);

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Felipe", 150,"sword");

        System.out.println("Initial health is: " + enhancedPlayer.getHealth());
    }
}
