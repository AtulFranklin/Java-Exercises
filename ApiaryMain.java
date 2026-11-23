class Apiary{
    private String farmName;
    private int jarPrice;
    public Apiary(String farmName, int jarPrice){
        this.farmName = farmName;
        this.jarPrice = jarPrice;
    }
    
    class Hive{
        private int hiveNumber;
        private int honeyKg;
        public Hive(int hiveNumber, int honeyKg){
            this.hiveNumber = hiveNumber;
            this.honeyKg = honeyKg;
        }
        public int jars(){
            return honeyKg * 2;
        }
        public int earnings(){
            return jars() * jarPrice;
        }
        public int getHoneyKg(){
            return honeyKg;
        }
        public void report(){
            System.out.println(farmName + " | Hive "+ hiveNumber +": "+ honeyKg +" kg -> "+ jars() + " jars -> $" + earnings());
        }
    }
    
    static class Inspector{
        public String grade(int honeyKg){
            if(honeyKg >= 15){
                return "Strong";
            } else if (honeyKg >= 8){
                return "Average";
            } else {
                return "Weak";
            }
        }
    }
}
public class ApiaryMain {
    public static void main(String[] args) {
        Apiary a1 = new Apiary("Golden Meadow", 8);
        Apiary.Hive h1 = a1.new Hive(1,18);
        Apiary.Hive h2 = a1.new Hive(2,9);
        Apiary.Hive h3 = a1.new Hive(3,5);
        Apiary.Hive[] hives = {h1,h2,h3};
        Apiary.Inspector aa1 = new Apiary.Inspector();
        int jars = 0;
        int earnings = 0;
        for(Apiary.Hive hive : hives){
            hive.report();
            jars += hive.jars();
            earnings += hive.earnings();
            System.out.println("  Grade: " + aa1.grade(hive.getHoneyKg()));
        }
        System.out.println("Total jars: " + jars);
        System.out.println("Season income: $" + earnings);
    }
}
