import java.util.Arrays;

public class Java_Five_Arrays {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // Exception is an error in Java, which mean an error was erased, and the program crashed
        System.out.println(numbers);
        // The answer is printed in an unusual way because when we print an array
        // Java returns the string which is calculated based on the address of the object, which is array
        System.out.println(Arrays.toString(numbers));
        // If no list is filled, instead of error, we get zero in it
        // toString is implemented multiple times of methods, which is known as "Method overloading"

        int[] Guest = {2, 3, 5, 1, 4};
        System.out.println(Guest.length);
        System.out.println(Arrays.toString(Guest));
        //Arrays have a fixed type, like Python, you cannot add new numbers or remove them by program

        int[] Future = {9, 2, 1, 5, 8};
        Arrays.sort(Future);
        // sort is a void., it cannot be printed using the system
        System.out.println(Arrays.toString(Future));



        // "sout" +  tab = System.out.println()
    }
}