import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        double pi = 3.14159;
//        String valueOfPi = "The value of pi is approximately ";
//        System.out.printf("The value of pi is approximately %.2f.%n.", pi);
//        System.out.format(valueOfPi + pi + "." );
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        String userInput = scanner.nextLine() + scanner.nextLine();

//        System.out.println("Enter a string: ");
//        String firstString = scanner.nextLine();
//        System.out.println("Enter another string: ");
//        String secondString = scanner.nextLine();
//        System.out.println("Enter the last string: ");
//        String thirdString = scanner.nextLine();
//        System.out.println("First string: " + firstString + "\n Second string: " + secondString + "\n Last string: " + thirdString);

//        System.out.println("Enter three words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("Your three words are: %n%s%n%s%n%s.", word1, word2, word3);

//        System.out.println("Enter a sentence: ");
//        String firstSentence = scanner.nextLine();
//        System.out.println(firstSentence);

        System.out.println("Enter a width: ");
        String width = scanner.nextLine();
        System.out.println("Enter a length: ");
        String length = scanner.nextLine();
        System.out.println("The area of the room is: " + (Integer.parseInt(width) * Integer.parseInt(length)));
        System.out.println("The perimeter of the room is: " + (2*Integer.parseInt(width)) + (2*Integer.parseInt(length)));

//        System.out.println("Enter a width: ");
//        double width = scanner.nextDouble();
////        System.out.println(width);
//        System.out.println("Enter a length: ");
//        double length = scanner.nextDouble();
//        System.out.println("The area of the room is: " + (width * length));
//        System.out.println("The perimeter of the room is: " + (2*width) + (2*length));
//        System.out.println("Now enter a height: ");
//        double height = scanner.nextDouble();
//        System.out.println("The volume of the room is: " + (length * width * height));

    }
}
