
public class Averaging {
/*
    Create a method called average that calculates the average of the numbers passed as parameters. 
    The previously created method sum must be used inside this method!
*/
    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here   
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here    
        return sum(number1,number2,number3,number4) /  4.0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
