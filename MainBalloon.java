class Balloon {
    private String name;
    private int seats;
    private double basePrice;
    
    public Balloon(String name, int seats, double basePrice){
        this.name = name;
        this.seats = seats;
        this.basePrice = basePrice;
    }
    public void describe(){
        System.out.println("Balloon: "+ name + " | Seats: " + seats);
    }
    public double ticketPrice(){
        return basePrice;
    }
}
class SunriseBalloon extends Balloon{
    private String launchTime;
    public SunriseBalloon(String name, int seats, double basePrice, String launchTime){
        super(name, seats, basePrice);
        this.launchTime = launchTime;
    }
    @Override
    public void describe(){
        super.describe();
        System.out.println("  Launch: " + launchTime + " (sunrise flight)");
    }
    @Override
    public double ticketPrice(){
        return (super.ticketPrice() + 25.0);
    }

}

public class MainBalloon {
    public static void main(String[] args) {
        Balloon b1 = new Balloon("Skylark", 4, 120.0);
        SunriseBalloon b2 = new SunriseBalloon("Golden Dawn", 6, 150.0, "5:45 AM");
        SunriseBalloon b3 = new SunriseBalloon("Morning Ember", 2, 200.0, "6:10 AM");
        Balloon[] flights = {b1,b2,b3};
        double sum = 0;
        for(Balloon flight : flights){
            flight.describe();
            double cost = flight.ticketPrice();
            sum += cost;
            System.out.println("  Ticket: $" + cost);
        }
        System.out.println("Total for one seat on every flight: $" + sum);
    }
}
