package section4;


public class ifelse_methods
{
    public static void main(String args[])
    {
        displayHighScorePosition("Felipe", calculateHighScorePosition(1500));
        displayHighScorePosition("Isra", calculateHighScorePosition(900));
        displayHighScorePosition("Alex", calculateHighScorePosition(400));
        displayHighScorePosition("Fabi", calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " Managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore)
    {
        if(playerScore >= 1000) return 1;
        else if(playerScore >= 500 && playerScore < 1000) return 2;
        else if(playerScore >= 100 && playerScore < 500) return 3;
        else return 4;
    }
}
