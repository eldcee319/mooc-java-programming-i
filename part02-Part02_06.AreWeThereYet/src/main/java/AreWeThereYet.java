
import java.util.Scanner;

public class AreWeThereYet {
/*
    Write a program that asks the user to input values until they input the value 4.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 4) {
                break;
            }
        }
    }
}
