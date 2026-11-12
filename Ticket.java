public class Ticket {
    public String movie;
    private int seat;
    final double Price = 12.50;

    public Ticket(String movie, int seat){
        this.movie = movie;
        this.seat = seat;
    }

    public void showTicket(){
        System.out.println("Movie: "+ movie +", Seat: "+ seat +", Price: $"+ Price);
    }

    static void showCinema(){
        System.out.println("Welcome to Star Cinema");
    }

}