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
}
