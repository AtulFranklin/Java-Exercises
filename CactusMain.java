class Plant {
    protected String name;
    protected int waterMl;
    public void water(){
        System.out.println("Watering "+ name + " with " + waterMl + " ml.");
    }
}
//class MiniFern extends Fern {}
class Cactus extends Plant{
    private int spines;
    public Cactus(String name, int waterMl, int spines){
        this.name = name;
        this.waterMl = waterMl;
        this.spines = spines;
    }
    public void showInfo(){
        if(spines>50){
            System.out.println(name + " has " + spines +" spines - handle with gloves!");
        } else {
            System.out.println(name + " has " + spines + " spines - safe to touch.");
        }
    }
}
final class Fern extends Plant{
    private boolean likesShade;
    public Fern(String name, int waterMl, boolean likesShade){
        this.name = name;
        this.waterMl = waterMl;
        this.likesShade = likesShade;
    }
    public void showInfo(){
        if(likesShade){
            System.out.println(name + " prefers shade.");
        } else {
            System.out.println(name + " prefers indirect sun.");
        }
    }
}
public class CactusMain {
    public static void main(String[] args){
        Cactus cac1 = new Cactus("Barrel Cactus", 50, 120);
        cac1.water();
        cac1.showInfo();
        Cactus cac2 = new Cactus("Bunny Ears", 30, 20);
        cac2.water();
        cac2.showInfo();
        Cactus cac3 = new Cactus("Star Cactus", 40, 50);
        cac3.water();
        cac3.showInfo();
        Fern fer1 = new Fern("Boston Fern", 400, true);
        fer1.water();
        fer1.showInfo();
        Fern fer2 = new Fern("Kimberly Queen", 350, false);
        fer2.water();
        fer2.showInfo();
    }
}
