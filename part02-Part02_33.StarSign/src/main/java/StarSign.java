
public class StarSign {
/*
    1.Define a method called printStars that prints the given number of stars and a line break.
    2.Define a method called printSquare(int size) that prints a suitable square with the help of the 
    printStars method. So the method call printSquare(4) results in the following output:   
    ****
    ****
    ****
    ****
    3.Write a method called printRectangle(int width, int height) that prints the correct rectangle by 
    using the printStars method. So the method call printRectangle(17, 3) should produce the following output:
    *****************
    *****************
    *****************
    4.Create a method called printTriangle(int size) that prints a triangle by using the printStars 
    method. So the call printTriangle(4) should print the following:
    *
    **
    ***
    ****
*/
    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for(int x=0;x<number;x++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for(int x=0;x<size;x++ ) {
            printStars(size);         
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for(int x=0;x<height;x++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for(int x=0;x<size-1;x++) {       
            for(int y=0;y<=x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }    
        printStars(size);
    }
}
