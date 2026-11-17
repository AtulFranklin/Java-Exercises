import java.util.Scanner;
import kiln.Firing;
public class FiringMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pieces?");
        int count = sc.nextInt();
        String type = "";
        int temp = 0;
        int counter = 0;
        String result = "";
        for(int i=1; i<=count; i++){
            System.out.println("Clay type:");
            type = sc.next();
            System.out.println("Temperature:");
            temp = sc.nextInt();
            Firing f = new Firing(type, temp);
            result = f.getResult();
            if(result.equals("Perfect")){
                counter++;
            }
            System.out.println("Piece " + i + ": " + f.getClayType() + " at " + f.getTemperature() + "C -> " + result);
        }
        System.out.println("Perfect pieces: " + counter + " of "+ count);
        sc.close();
    }
}