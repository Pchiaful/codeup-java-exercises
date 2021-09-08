import java.util.Scanner;
public class StringsLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = sc.next();
//        DONT DO THIS. STRINGS ARE OBJECTS. YOU NEED .equals
//        if (userInput == "Justin") {
//            System.out.println("The user entered the string 'Justin'");
//        } else {
//            System.out.println("The user did not enter the string 'Justin'");
//        }
        if (userInput.equals("justin")) {
            System.out.println("The user entered the string 'Justin'");
        } else {
            System.out.println("The user did not enter the string 'Justin'");
        }

    }
}
