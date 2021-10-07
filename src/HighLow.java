public class HighLow {


    public static boolean printGuessMessage(int guess, int randomNum) {
        boolean keepGoing = true;
        if (guess == randomNum) {
            System.out.println("Nice try!");
            keepGoing = false;
        } else if (guess < randomNum) {
            System.out.println("Higher");
        } else {
            System.out.println("Lower!");
        }
        return keepGoing;
    }

    public static void runGuesses(int randomNum) {
        System.out.println("Guess a number between 1 and 100");
        int guess = MethodsExercises.getInteger(1, 100);

        if (printGuessMessage(guess, randomNum)) { // return a boolean to decide to continue
            runGuesses(randomNum);
        }
    }

    public static void init() {
        System.out.println("Welcome to the High / Low Game!");
        int randomNum = MethodsExercises.getRandomInt(1, 100);
        System.out.println(randomNum); // FOR DEBUGGING
        runGuesses(randomNum);
    }

    public static void main(String[] args) {
        init();
    }

}

