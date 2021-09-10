public class JavaCat {
    private String name;
    private String sound;

//    public void makeNoise() {
//        System.out.println(Quote.randomQuote());
//    }

    public void aName(String name) {
        this.name = name;
    }

    public void aSound(String sound) {
        this.sound = sound;
    }

    public void makeNoise() {
        System.out.println(name + " says " + sound);
    }

    public void goodKitty() {
        System.out.println(name + " is good kitty.");
    }

    public JavaCat() {

    }
    public JavaCat(String name, String sound) {
        this.name = name;
        this.sound = sound;
        this.makeNoise();
    }
}
