
import java.util.Scanner;

public class Factorial {

    /*
    mplement a program which calculates the factorial of a number given by the user.

    Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example, the factorial of 4 
    is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been specified that the factorial of 0 is 1,
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        int count = 1;
        int prod = 1;
        while(count <= num) {
            prod = prod * count;
            count++;
        }
        System.out.println("Factorial:" + prod);
               
    }
}
