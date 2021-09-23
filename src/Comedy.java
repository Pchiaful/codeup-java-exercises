public class Comedy extends Moive{
    protected boolean funny;


    public Comedy(String name, String director, boolean funny) throws IllegalArgumentException {
        super(name, director);
        this.funny = funny;
    }

    public boolean isFunny() {
        return funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }

    public static void main(String[] args) {
        Comedy comedy = new Comedy("unfunny", "Mr lorg", false);
        System.out.println(comedy.getName() + " " + comedy.getDirector() + " " + comedy.isFunny());
    }
}
