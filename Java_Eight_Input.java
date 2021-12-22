import java.util.Scanner;

public class Java_Eight_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you ? ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
        // Field is a variable that we define in a class
        // Out = Print something out; Output
        // In = Input

        Scanner x = new Scanner(System.in);
        System.out.println("First Name :");
        String z = x.next();
        System.out.println("Hello " + z);

        // One word of a string is called a token
        // Full names have more than one token, and String scanner only reads one token
        Scanner R = new Scanner(System.in);
        System.out.println("Full Name :");
        String user = R.nextLine();
        System.out.println("You are " + user);
    }
}