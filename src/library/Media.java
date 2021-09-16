package library;

abstract public class Media {
    public void viewMedia() {
        System.out.println("You look at the media for information.");
    }

    public void checkOut() {
        System.out.println("I checkout media for learning purposes only.");
    }
    public abstract void view();
}
