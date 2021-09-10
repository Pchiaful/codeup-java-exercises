public class FighterTest {
    public static void main(String[] args) {
        // We instantiate the fighter object
        JavaFighter arata = new JavaFighter("Arata", 17, 14);
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
        arata.battleRoar();

        JavaFighter grug = new JavaFighter("Grug", 20, 11);
//        grug.name = "Grug";
        grug.battleRoar();
//        grug.printStats();
//        System.out.println("Grug rolls to attack and rolls a " + grug.attackRoll() + ".");
    }
}
