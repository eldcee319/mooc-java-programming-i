import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        List<Integer> list = new ArrayList<>();
        
        while(true) {
           int input = Integer.valueOf(scanner.nextLine());
           if(input == -1) {
               break;
           }
           list.add(input);
        }
        System.out.println("");
        
        double avg=0, sum=0;
        for(int newList : list){
            sum+=newList;           
        }
        
        System.out.println("Average: " + sum/list.size());
        
    }
}