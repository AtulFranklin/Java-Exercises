public class HotAirBaloon{
    private final String pilot;
    private int altitude;

    public HotAirBaloon(String pilot){
        this.pilot = pilot;
    }

    public String getPilot(){
        return pilot;
    }

    public int getAltitude(){
        return altitude;
    }

    public void setAltitude(int altitude){
        if(altitude >= 0 && altitude <= 3000){
            this.altitude = altitude;
        } else {
            System.out.println("Invalid altitude: " + altitude + " m. Staying at " + this.altitude + " m.");
        }
    }
}