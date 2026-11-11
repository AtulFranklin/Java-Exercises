// Program to simulate Phone information system
public class Phone {
    String model;
    int battery;

    public Phone(String model, int battery) {
        this.model = model;
        this.battery = battery;
    }

    public void rename(String model){
        this.model = model;
        System.out.println("Renamed to " + model);
    }

    public void charge(int amount){
        if((battery+amount)>100){
            battery = 100;
        } else {
            battery = battery + amount;
        }
        System.out.println("Charged " + model + ". Battery: "+ battery + "%");
    }

    public void use(int amount){
        if((battery-amount)<0){
            battery = 0;
        } else {
            battery = battery - amount;
        }
        System.out.println("Used " + model + ". Battery: "+ battery + "%");
    }

    public String getStatus(){
        String status;
        if(battery<20){
            status = "Low";
        } else {
            status = "OK";
        }
        return status;
    }

    public void printInfo(){
        System.out.println("Model: " + model + ". Battery: "+ battery + "%" + " Status: " + getStatus() );
    }

    public static void main (String[] args){
        Phone p1 = new Phone("Pixel", 50);
        p1.use(35);
        p1.printInfo();
        p1.charge(100);
        p1.rename("Pixel 9");
        p1.printInfo();
        Phone p2 = new Phone("iPhone", 10);
        p2.use(25);
    }
}