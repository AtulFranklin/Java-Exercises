public class Ticketm{
    public static void main(String[] args){
        Ticket.showCinema();
        Ticket t1 = new Ticket("Dune", 14);
        System.out.println(t1.movie);
        t1.showTicket();
        Ticket t2 = new Ticket("Avatar", 7);
        t2.showTicket();
   // System.out.println(t1.seat);  // error: seat is private
   // t1.PRICE = 5.0;               // error: PRICE is final
    }
}