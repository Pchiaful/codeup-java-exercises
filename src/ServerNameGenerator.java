import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {
            "hot",
            "flaky",
            "fuzzy",
            "wet",
            "colorful",
            "shiny",
            "round",
            "clear",
            "amorphous",
            "crunchy"
    };

    private static String[] nouns = {
            "tree",
            "cloud",
            "car",
            "cat",
            "ring",
            "tattoo",
            "cup",
            "berry",
            "bridge",
            "hanger"
    };


    public static String  getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }


    public static void main(String[] args) {
        System.out.println("Your server name is: " + getRandom(adjectives) + "-" + getRandom(nouns));
    }
}
