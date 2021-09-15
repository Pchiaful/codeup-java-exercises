package birds;

public class BirdTest {

    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("cardinal");
        //same as above but faster syntax
        Bird cardinal = new Bird("Cardinal");
        System.out.println(cardinal.getName() + " says: ");
        cardinal.makeNoise();
        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("mallard");
        System.out.println(mallard.getName() + " says: ");
        mallard.makeNoise();
        mallard.move();

        Finch goldfinch = new Finch();
        goldfinch.setName("Gold Finch");
        System.out.println(goldfinch.getName() + " says:");
        goldfinch.makeNoise();
        goldfinch.move();

        Bird loud = new Duck();

    }

}
