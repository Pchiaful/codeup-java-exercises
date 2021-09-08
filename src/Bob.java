import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepTalking = false;
       do {
           System.out.println("Ask Bob a question: ");

           String qForBob = sc.nextLine();
           if (qForBob.endsWith("?")) {
               System.out.println("Bob answers: 'Sure.'");
           } else if (qForBob.endsWith("!")) {
               System.out.println("Bob answers: 'Whoa, chill out!'");
           } else if (qForBob.isBlank()) {
               System.out.println("Bob answers: 'Fine, Be that way!'");
           } else {
               System.out.println("Bob answers: 'Whatever.'");
           } else {
               System.out.println("Do you want to keep talking to Bob?");
               qForBob = sc.nextLine();
           }
       }while (keepTalking);

    }
}
