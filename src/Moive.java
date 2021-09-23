public class Moive {
    private String name;
    private String director;

    public Moive(String name, String director) throws IllegalArgumentException {
        if (name == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
