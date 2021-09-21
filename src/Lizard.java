import java.util.List;
import java.util.Scanner;

public class Lizard {
    String name;

    public Lizard(String name) throws IllegalArgumentException {
//        Scanner sc = new Scanner();
//        System.out.println("Please input a string.");

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Need aa string, please.");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        Lizard thingy = new Lizard("");
        System.out.println(thingy.name);
    }
}
