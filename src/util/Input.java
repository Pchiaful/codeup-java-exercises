//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner;
//
//    public String getString() {
//        System.out.println("Please enter a string.");
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public boolean yesNo(String input) {
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }
//    public boolean yesNo() {
//        System.out.println("Do you agree?");
//        String answer = scanner.nextLine();
//        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
//    }
//
//    public String getInt() {
//        System.out.println("Please enter an integer: ");
//        int userInput = getString();
//        return userInput;
//    }
//    public int getInt(int min, int max) {
//        String prompt = "Enter an integer between " + min + " and " + max;
//        System.out.println("Enter an integer between " + min + " and " + max);
//        int userInput = scanner.nextInt();
//        while (userInput <= min || userInput >= max) {
//            System.out.println("Enter an integer between " + min + " and " + max);
//            userInput = scanner.nextInt();
//        }
//        return userInput;
//    }
//// ===== ALBERTS CODE =====
////    int getInt(int min, int max){
////        System.out.println("Enter a number between " + min + " and " + max);
////        int input = scanner.nextInt();
////        if (input < min || input > max){
////            getInt(min, max);
////        }
////        return input;
////    }
//
////    public double getDouble() {
////        System.out.println("Please enter an integer: ");
////        double userInput = scanner.nextDouble();
////        return userInput;
////    }
////    solutions for getDouble
//    public double getDouble(){
//        System.out.println("Enter a number:");
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }
//
//    public double getDouble(String prompt){
//        System.out.println(prompt);
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }
//    public double getDouble(double min, double max) {
//        String prompt = "Enter an integer between " + min + " and " + max;
//        System.out.println("Enter an integer between " + min + " and " + max);
//        double userInput = scanner.nextInt();
//        while (userInput <= min || userInput >= max) {
//            System.out.println("Enter andinteger between " + min + " and " + max);
//            userInput = scanner.nextInt();
//        }
//        return userInput;
//    }
//
//
//
//    public Input() {
//        scanner = new Scanner(System.in);
//    }
//}
