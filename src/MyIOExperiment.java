import java.util.Scanner;

public class MyIOExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String userInput = scanner.nextLine();
//        System.out.println("Hello, " + userInput + ".");
//        System.out.printf("Hello, %s." , userInput);
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
//        System.out.printf("You entered %d%n", userInput);
//        Option 1, an extra nextline
//        String ghostString = scanner.nextLine();
//        option 2: concatentate scanner.nextLine() in the string twice
        System.out.println("Enter a string: ");
        String firstString = scanner.nextLine() + scanner.nextLine();
        System.out.println("Enter another string: ");
        String secondString = scanner.nextLine();

        System.out.println("First sentence: " + firstString + "\n Second string: " + secondString);
    }
}
