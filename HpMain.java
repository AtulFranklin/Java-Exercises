public class HpMain{
    public static void main(String[] args){
        Houseplant obj1 = new Houseplant();
        obj1.setSpecies("Monstera");
        obj1.setHeightCm(40);
        int Height = obj1.getHeightCm();
        String Species = obj1.getSpecies();
        System.out.println("Species: " + Species);
        System.out.println("Height: " + Height);
        obj1.setHeightCm(52);
        System.out.println("New Height: " + obj1.getHeightCm() + " cm");
    }
}