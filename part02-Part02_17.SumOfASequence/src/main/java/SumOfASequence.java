
import java.util.Scanner;

public class SumOfASequence {
/*
    Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
    Sample output:
    Last number? 3
    The sum is 6
    
    The previous example calculated 1 + 2 + 3 = 6
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());
        int count = 1;   
        int sum = 0;
        while(count <= num) {
            sum+=count;
            count++;
        }
        System.out.println("The sum is " + sum);
           
    }
}
