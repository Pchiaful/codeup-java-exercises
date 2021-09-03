import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
        String myCohort = "Draco";
        String timeOfDay = "morning";
//        System.out.println(myCohort);
        System.out.printf("Good %s, %s!%n", timeOfDay, myCohort);
//        System.out.println("Will this be a separate line?");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("Your word was " + userInput);
    }
}