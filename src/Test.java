//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//
////        try{
////            String testString = "This is a string";
////            System.out.println(testString.length());
////            System.out.println(testString.substring(177));
////        } catch (IndexOutOfBoundsException something) {
////            System.out.println("whoa dude out of bounds");
////        }
//
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Please enter an integer");
////        String userInput = sc.nextLine();
////        try {
////            int userInputInteger = Integer.parseInt(userInput);
////            System.out.println("The integer in your string is " + userInputInteger);
////        } catch (NumberFormatException nfx) {
////            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
////        } finally {
////            System.out.println("Thank you for using this complex and useful app.");
////        }
//
////        public void aMoreComplexAskForInteger(){
////            Scanner scanner = new Scanner(System.in);
////            System.out.println("Please enter an integer");
////            String userInput = scanner.nextLine();
//////            userInput = null;
////            try {
////                int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
////            } catch (NullPointerException npx){
////                System.out.println("Oops you didn't enter anything");
////                npx.printStackTrace();
////            } catch (IndexOutOfBoundsException iobx) {
////                System.out.println("Oops your string wasn't long enough");
////                iobx.printStackTrace();
////            } catch (NumberFormatException nfx){
////                System.out.println("No integer between chars 10 and 15");
////                nfx.printStackTrace();
////            } finally {
////                System.out.println("That was useful wasn't it?");
////            }
////        }
//
//
//
//    }
//
//        public void subListMaker(String sentence){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter an integer");
//            int firstInt = scanner.nextInt();
//            System.out.println("Please enter another integer");
//            int secondInt = scanner.nextInt();
//            System.out.println(sentence);
//            try {
//            ArrayList<String> wordArrayList = new ArrayList<String>();
//            String[] stringArray = sentence.split(" ");
//            for (String word : stringArray){
//                wordArrayList.add(word);
//            }
//            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
//            String newSentence = String.join(" ", shorterList);
//            System.out.println(newSentence);
//        }catch (IndexOutOfBoundsException iobe) {
//                System.out.println("need integers between 0 and " + wordArrayist.size());
//            }catch (NullPointerException npe) {
//                System.out.println("no sentence");
//            }finally {
//                System.out.println("thanks");
//            }
//            }
//
//
//}
