
import java.util.Scanner;

public class SumOfASequenceTheSequel {
/*
    Implement a program which calculates the sum of a closed interval, and prints it. Expect the user 
    to write the smaller number first and then the larger number.

    Sample output
    First number? 3
    Last number? 5
    The sum is 12
    
    The above example internally calculated 3 + 4 + 5 = 12
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        while(num1 <= num2) {
            sum+=num1;
            num1++;
        }
        
        System.out.println("The sum is: " + sum);
        
    }
}
