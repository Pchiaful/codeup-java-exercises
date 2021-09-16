package library;

public class MediaTest {
    public static void main(String[] args) {
        Media vogue = new Magazine();
        vogue.view();
        vogue.checkOut();

        Media dictionary = new Book();
        dictionary.view();
        dictionary.checkOut();
    }
}
