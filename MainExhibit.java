class Exhibit {
    protected String name;
    public void playAudio(){
        System.out.println(name + ": No audio available.");
    }
    public int getMinutes(){
        return 0;
    }
}

class Fossil extends Exhibit {
    public Fossil(String name){
        this.name = name;
    }
    public void playAudio(){
        System.out.println(name + ": Dig into millions of years of history.");
    }
    public int getMinutes(){
        return 4;
    }
}

class Painting extends Exhibit {
    public Painting(String name){
        this.name = name;
    }
    public void playAudio(){
        System.out.println(name + ": Look closely at the brushstrokes.");
    }
    public int getMinutes(){
        return 3;
    }
}

class Meteorite extends Exhibit {
    public Meteorite(String name){
        this.name = name;
    }
    public void playAudio(){
        System.out.println(name + ": This rock fell from space!");
    }
    public int getMinutes(){
        return 2;
    }
}

public class MainExhibit {
    public static void main(String[] args) {
        int minutes = 0;
        Exhibit[] tour = { new Fossil("T-Rex Skull"), new Painting("Starry Lake"), new Meteorite("Willamette Fragment") };
        for(int i=0; i<tour.length; i++){
            System.out.print("Stop " + (i + 1) + " -> ");
            tour[i].playAudio();
            minutes += tour[i].getMinutes();
        }
        System.out.println("Total tour time: " + minutes + " minutes");
        if(minutes >= 10){
            System.out.println("Grab a coffee, it's a long tour!");
        } else {
            System.out.println("Quick tour!");
        }
    }
}