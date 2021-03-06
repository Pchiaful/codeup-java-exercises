import java.util.Scanner;
public class MethodsExercises {
    Scanner sc = new Scanner(System.in);

//    public static void main(String[] args) {
//        additionMethod(1,2);
//        subtractionMethod(1,2);
//        multiplicationMethod(1,2);
//        divisionMethod(1,2);
//        modulusMethod(1,2);
//    }

//    ===== 1 =====
//    public static void additionMethod(int numOne, int numTwo) {
//        System.out.println(numOne + numTwo);
//    }
//    public static void subtractionMethod(int numOne, int numTwo) {
//        System.out.println(numOne - numTwo);
//    }
//
//    public static void multiplicationMethod(int numOne, int numTwo) {
//        System.out.println(numOne * numTwo);
//    }
//
//    public static void divisionMethod(int numOne, int numTwo) {
//        System.out.println(numOne / numTwo);
//    }
//
//    public static void modulusMethod(int numOne, int numTwo) {
//        System.out.println(numOne % numTwo);
//    }

//    ===== 2 =====

//    public static void main(String[] args) {
//        getInteger(1, 10);
//    }
//
//    public static int getInteger(int min, int max) {
//        System.out.println("Enter a number between 1 and 10.");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = Integer.parseInt(scanner.nextLine());
//        if (userInput < min || userInput > max) {
//            System.out.println("Please input a number between 1 and 10.");
//            getInteger(min, max);
//        } else {
//            System.out.println(userInput + " is between " + min + " and " + max);
//        }
//        return userInput;
//    }
//}

//===== 3 =====

    public static void main(String[] args) {
        factorialMethod();
    }

    public static void factorialMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int userInput = sc.nextInt();
        System.out.println(userInput + "!");
        System.out.println("Would you like to continue?");
        String continueUser = sc.nextLine();
        if (continueUser.contains("yes") || continueUser.contains("y")) {

        }
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInt = sc.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Input out of range!");
            return getInteger(min, max);
        }
    }

    public static int getRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void diceRoll() {
        System.out.println("Welcome to Dice Roll!");
        System.out.println("Enter number of sides of the dice. (1-6)");
        int noOfSidesOfDice = getInteger(1, 6);
        System.out.printf("You have rolled %d and a %d",
                getRandomInt(1, noOfSidesOfDice),
                getRandomInt(1, noOfSidesOfDice));
    }
}