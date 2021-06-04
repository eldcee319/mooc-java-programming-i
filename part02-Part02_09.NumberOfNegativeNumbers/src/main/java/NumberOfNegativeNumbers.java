
import java.util.Scanner;

/*
Write a program that reads values from the user until they input a 0. After this, the program prints 
the total number of inputted values that are negative. The zero that's used to exit the loop 
should not be included in the total number count.
*/

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNegative = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0) {
                break;
            }
            
            if(number < 0) {
                countNegative += 1;
            }
        }
        
        System.out.println("Number of negative numbers: " + countNegative);
    }
}
