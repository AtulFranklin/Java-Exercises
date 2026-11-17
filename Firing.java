package kiln;
public class Firing {
    private String clayType;
    private int temperature;
    public Firing(String clayType, int temperature) {
        this.clayType = clayType;
        this.temperature = temperature;
    }
    public String getClayType(){
        return clayType;
    } 
    public int getTemperature(){
        return temperature;
    }
    public String getResult(){
        if(temperature<1000){
            return "Underfired";
        } else if (temperature>=1000 && temperature<=1250){
            return "Perfect";
        } else {
            return "Overfired";
        }
    }    
}