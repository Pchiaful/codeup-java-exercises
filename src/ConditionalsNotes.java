import java.util.Scanner;

public class ConditionalsNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x = 0
//        if (x > 0) {
//            System.out.println("");
//        }

//        int c = 0, d = 100, e = 50;
//        if( c == 0 && e++ < 100 )
//        {
//            d = 150;
//        }
//        System.out.println("e = " + e );

        // write a Java program that asks the user for their age and then tells them if they are a teenager or not.
        // bonus: if not, tell them whether they are younger or older than a teenager.
//        System.out.println("Enter your age: ");
//        int userAge = scanner.nextInt();
//        if (userAge >= 13 && userAge < 20) {
//            System.out.println("You are a teenager");
//        } else {
//            System.out.println("You are not a teenager.");

//        while loops
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

//        do while loop
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        } while (i<10);
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

//        for loop
//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.println("now im in the loop" + i);
//        }

//        BONUS LOOP
        String word = " cans";
        int numberOfCansOfBigRedOnTheWall = 99;
        while (numberOfCansOfBigRedOnTheWall > 0) {

            System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red on the wall");
            System.out.println(numberOfCansOfBigRedOnTheWall + " " + " of Big Red");
            System.out.println(" Take one down, pass it around ");
            numberOfCansOfBigRedOnTheWall--;
            if (numberOfCansOfBigRedOnTheWall == 1) {
                word = " can";
            }
            if (numberOfCansOfBigRedOnTheWall == 0) {
                System.out.println(" No more cans of Big Red on the wall");

            } else {
                System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red on the wall. ");
            }
        }
    }
}
