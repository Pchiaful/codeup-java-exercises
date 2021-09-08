import java.util.Scanner;

public class Therapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean patientDiagnosis = false;
        do {
            System.out.println("How are you today?");

//        String patientResponse = scanner.nextLine();
            String patientResponse = scanner.nextLine();
            if (patientResponse.equalsIgnoreCase("good") || patientResponse.equalsIgnoreCase("ok") || patientResponse.equalsIgnoreCase("fine")) {
                System.out.println("Good. I am glad we are making progress.");
            } else if (patientResponse.equalsIgnoreCase("not good") || patientResponse.equalsIgnoreCase("could be better") || patientResponse.equalsIgnoreCase("I need help")) {
                System.out.println("Let's see if we can get to a better place today.");
            }

        } while (patientDiagnosis);

//        .contains is a thing, lookd it up, its like .equals
    }
}