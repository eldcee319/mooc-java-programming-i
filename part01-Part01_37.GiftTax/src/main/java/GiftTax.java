
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value=0;
        System.out.println("Value of the gift?");
        value = Integer.valueOf(scan.nextLine());
        
        double tax = 0;
        if(value < 5000) {
            System.out.println("No tax!");
        } else if(value >= 5000 && value <= 25000) {
            tax = 100;
            tax = tax + ((value-5000)*.08);
            System.out.println("Tax: " + tax);
        } else if(value >= 25000 && value <= 55000) {
            tax = 1700;
            tax = tax + ((value-25000)* .10);
            System.out.println("Tax: " + tax);
        } else if(value >= 55000 && value <= 200000) {
            tax = 4700;
            tax = tax + ((value-55000)* .12);
            System.out.println("Tax: " + tax);
        } else if(value >= 200000 && value <= 1000000) {
            tax = 22100;
            tax = tax + ((value-200000)* .15);
            System.out.println("Tax: " + tax);
        } else if(value >= 1000000) {
            tax = 142100;
            tax = tax + ((value-1000000)*.17);
            System.out.println("Tax: " + tax);
        } 
    }
}
