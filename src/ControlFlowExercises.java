import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//     =======   while   ========
//        int i = 5;
//        while (i <= 15 ) {
//            System.out.println("The value of i is currently: " + i);
//            i = i +1;
//        }
//      ========  do while ========
//        int i =0;
//        do {
//            System.out.println(i);
//            i = i+2;
//        }while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i - 5;
//        } while (i >= -10);

//        double i = 2;
//        do {
//            System.out.println(i);
//            i = Math.pow(i,2);
//        } while ( i <= 1000000);

//        ====== FOR LOOP ======

//        double i;
//        for(i = 5; i <=15;i++ ) {
//            System.out.println(i);
//        }
//        for(i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }
//        for(i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//        for(i = 2; i <= 1000000; i = Math.pow(i,2)) {
//            System.out.println(i);
//        }
//        ===== FIZZBUZZ =====
//        int i;
//        for (i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        ===== TABLE =====
        System.out.println("Enter a code: ");
        int codeNumber = scanner.nextInt();

    }
}

