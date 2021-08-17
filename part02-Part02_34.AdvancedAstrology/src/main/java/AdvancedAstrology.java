
public class AdvancedAstrology {

    /*
    Part 1
    Define a method called printSpaces(int number) that produces the number of spaces specified by number.
    The method does not print the line break.
    Part 2
    Create a method called printTriangle(int size) that uses printSpaces and printStars to print the 
    correct triangle
    Part 3
    Define a method called christmasTree(int height) that prints the correct Christmas tree. 
    The Christmas tree consists of a triangle with the specified height as well as the base. 
    The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
    The tree is to be constructed by using the methods printSpaces and printStars.
    */
    public static void printStars(int number) {
        // part 1 of the exercis
        int count = 0;
        while(count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int count = 0;
        while(count < number) {
            System.out.print(" ");
            count++;
        }     
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 1;   
        while(count <= size) {
            printSpaces(size-count);
            printStars(count);
            count++;
        }          
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count=1;
        int size = (height*2)-1;

        while(count<=size) {
            printSpaces((size-count)/2);
            printStars(count);
            count+=2;
        }

        int base = height + 1;
        int baseSize = height + 2;

        while(base<=baseSize) {
            printSpaces((size-3)/2);
            printStars(3);
            base++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
