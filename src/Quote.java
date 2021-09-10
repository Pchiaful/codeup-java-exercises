public class Quote {
    public static int randomQuote() {
        int randomQuoteHere = (int) (Math.random() *4) + 1;
        if (randomQuoteHere == 1) {
            System.out.println("I am hungry.");
        }else if (randomQuoteHere == 2) {
            System.out.println("Give me pats.");
        }else if (randomQuoteHere == 3) {
            System.out.println("You smell like a baka.");
        }else if (randomQuoteHere == 4) {
            System.out.println("I am the void. I am eternal. Enter the void, servant.");
        }
        return randomQuoteHere;
    }
}
