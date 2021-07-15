
import java.util.Scanner;

public class Reprint {
/*
    Expand the previous program so that the main program asks the user for the number of times the 
    phrase will be printed (i.e. how many times the method will be called).
*/
    public static void main(String[] args) {            
        Scanner scanner = new Scanner(System.in);   
        // ask the user for how many times should the text be printed
        System.out.println("How many times?");
        int times = Integer.valueOf(scanner.nextLine());
        int count = 1;
        // then call the printText-method multiple times with a while-loop      
        while(count<=times) {
            printText();
            count++;
        }
    }    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}
