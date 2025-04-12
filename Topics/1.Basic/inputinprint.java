import java.util.Scanner;

public class inputinprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // REMEMBER VERY CAREFULLY TO INTER THE "+" OPERATOR IN THE PRINT STATEMENT

        System.out.println("Hello, " + name + "! Welcome to the program.");
    }
}