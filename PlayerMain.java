public class PlayerMain{
    public static void main (String[] args){
        Player p1 = new Player("Atul");
        p1.addPoints(40); 
        p1.showPlayer();
        Player p2 = new Player("Sam"); 
        p2.addPoints(70);
        p2.addPoints(50); 
        p2.showPlayer();
        Player p3 = new Player("Riya"); 
        p3.showPlayer();
        Player.showCount();
        p1.addPoints(60); 
        p1.showPlayer();
    }
}