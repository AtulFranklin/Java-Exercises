public class HabMain{
    public static void main(String[] args) {
        HotAirBaloon balloon = new HotAirBaloon("Maya");
        System.out.println("Pilot: " + balloon.getPilot());
        System.out.println("Altitude: " + balloon.getAltitude() +" m");
        balloon.setAltitude(1200);
        System.out.println("Altitude: " + balloon.getAltitude() + " m");
        balloon.setAltitude(3500);
        System.out.println("Altitude: " + balloon.getAltitude() + " m");
        balloon.setAltitude(-50);
        System.out.println("Altitude: " + balloon.getAltitude() + " m");
        balloon.setAltitude(3000);
        System.out.println("Altitude: " + balloon.getAltitude() + " m");
    }
}