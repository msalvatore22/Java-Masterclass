public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("bob", calculateHighScorePosition(1500));
        displayHighScorePosition("tim", calculateHighScorePosition(1000));
        displayHighScorePosition("john", calculateHighScorePosition(500));
        displayHighScorePosition("david", calculateHighScorePosition(100));
        displayHighScorePosition("paul", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
            + highScorePosition + " on the high score list"
        );
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        } else if ( playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }

}