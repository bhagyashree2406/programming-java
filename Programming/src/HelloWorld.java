import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // Input from standard input - keyword


        Scanner reader =new Scanner(System.in);
        System.out.println("Enter a number:");

        // nextInt () reads the next integer from the keyboard
        int number = reader.nextInt();

        // Println prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}
