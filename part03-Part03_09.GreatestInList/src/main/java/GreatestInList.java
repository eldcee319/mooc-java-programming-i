
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    /*
    The exercise template contains a base that reads numbers from the user and adds them to a list. 
    Reading is stopped once the user enters the number -1.

    Continue developing the program so that it finds the greatest number in the list and prints 
    its value after reading all the numbers. The programming should work in the following manner.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        /*
        algo:
            1. Loop the list.
            2. Compare xₙ to yₙ but if xₙ is equal to the size of the list then break the loop.
            3. Store var max
            4. Print max
        */
        int max = list.get(0);
        for(int x=0; x<list.size(); x++) {
            if(x==(list.size()-1)) {
                break;
            } else {
                if(list.get(x) < list.get(x+1)){
                    max = list.get(x+1);
                }
            }                    
        }      
        System.out.println("The greatest number: " + max);
    }
}
