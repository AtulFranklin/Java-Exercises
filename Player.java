// Player database
public class Player {
    public String name;
    private int score = 0;
    final int MAX_SCORE = 100;
    static int playerCount = 0;

    public Player(String name){
        this.name = name;
        playerCount += 1;
    }

    public void addPoints(int points){
        if((score + points) > MAX_SCORE){
            score = MAX_SCORE;
        } else {
            score += points;
        }
    }

    public void showPlayer(){
        System.out.println(name + ": " + score + " points");
    }

    static void showCount(){
        System.out.println("Total players: " + playerCount);
    }
}