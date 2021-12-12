import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
 
        List<Integer> list = new ArrayList<>();
        while(true) {    
            int input=Integer.valueOf(scanner.nextLine());
            if(input==9999) {
                break;
            }
            list.add(input); // this will add your input to arrayList
        }
        System.out.println("");
        
        // find the smaller value in arrayList between index1 and index2, store in var smallest.      
        int smallest = list.get(0) <= list.get(1) ? list.get(0) : list.get(1); 
      
        for(int i=0;i<list.size();i++) {
            //iterate the list. If index is greater than smallest, assign new value for smallest
            if(smallest>=list.get(i)){
                smallest = list.get(i);
            } 
        }
        
        System.out.println("Smallest number: " + smallest); // print the smallest
        
        for(int x=0;x<list.size();x++) {
            if(list.get(x)==smallest){
                System.out.println("Found at index: " + x);
            }
        }
            
    }
}