
import java.util.Scanner;

/*
Write a program by using the loop example that asks "Shall we carry on?" until the user 
inputs the string "no".
*/

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        while(true) {
            System.out.println("Shall we carry on?");
            String msg = scanner.nextLine();
            
            if(msg.equals("no")) {
                break;
            }
        }

    }
}
