package consumables;

public class Carrot {
    private boolean isPeeled;

    public boolean isPeeled() {
        return isPeeled;
    }

    public void setPeeled(boolean peeled) {
        isPeeled = peeled;
    }

    public Carrot(boolean isPeeled) {
        this.isPeeled = isPeeled;
    }
    // getters setters constructors...

    public void consume() {
        System.out.println("Eat, bite by bite");
    }

    public void checkIfExpired() {
        System.out.println("Observe color and smell");
    }

    public void throwAway() {
        System.out.println("Throw into compost pile");
    }
}
