public class JavaCatTest {
    public static void main(String[] args) {
        JavaCat shammy = new JavaCat();
        shammy.name = "Shammy";
        shammy.sound = "Mrrrrow.";
        shammy.makeNoise();
        shammy.goodKitty();

        JavaCat aja = new JavaCat();
        aja.name = "Aja";
        aja.sound = "Mew!";
        aja.makeNoise();
        aja.goodKitty();


//        System.out.println("here is a number between 1 and 4: " + aja.randomQuoteForKitty());
    }
}
