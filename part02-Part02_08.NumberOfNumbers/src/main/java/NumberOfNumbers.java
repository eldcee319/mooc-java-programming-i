
import java.util.Scanner;

/*
Write a program that reads values from the user until they input a 0. After this, the program prints 
the total number of inputted values. The zero that's used to exit the loop should not be included in 
the total number count.
*/
public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            total += 1;
        }
        
        System.out.println("Number of numbers: " + total);
    }
}
