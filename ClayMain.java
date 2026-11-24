abstract class Pottery{
    private String name;
    private int clayGrams;
    
    public Pottery(String name, int clayGrams){
        this.name = name;
        this.clayGrams = clayGrams;
    }
    
    public String getName(){
        return name;
    }
    
    public int getClayGrams(){
        return clayGrams;
    }
    
    abstract double firingCost();
    
    public void printTicket(){
        System.out.println(name + " | " + clayGrams + " g | Firing: $" + firingCost());
    }
}

class Mug extends Pottery{
    public Mug(String name, int clayGrams){
        super(name, clayGrams);
    }
    @Override
    public double firingCost(){
        return (getClayGrams() / 100.0 + 2);
    }
}

class Vase extends Pottery{
    public Vase(String name, int clayGrams){
        super(name, clayGrams);
    }
    @Override
    public double firingCost(){
        return (getClayGrams() / 100.0 * 1.5);
    }
}

class Bowl extends Pottery{
    public Bowl(String name, int clayGrams){
        super(name, clayGrams);
    }
    @Override
    public double firingCost(){
        return 4.5;
    }
}

public class ClayMain {
    public static void main(String[] args){
        Mug m1 = new Mug("Morning Mug", 400);
        Vase v1 = new Vase("Tall Blue Vase", 1200);
        Bowl b1 = new Bowl("Rice Bowl", 300);
        Pottery[] kilnLoad = {m1,v1,b1};
        double total = 0;
        for (Pottery item : kilnLoad){
            item.printTicket();
            total += item.firingCost();
        }
        System.out.println("Total firing cost: $" + total);
        // Pottery p = new Pottery("Mystery", 100);
    }
}
