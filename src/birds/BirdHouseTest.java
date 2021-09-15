package birds;

public class BirdHouseTest {

    public static void main(String[] args) {
        //polymorphic array:
        //poly = many ; morphic = shape/form
        Bird[] birds = new Bird[3];
//        Bird goldfinsh = new Finch();
//        goldfinsh.setName("Lesser Goldfinch");
        birds[0] = new Finch();
        birds[0].setName("Lesser Goldfinch");
        birds[1] = new Duck();
        birds[1].setName("Mallard");
        birds[2] = new Penguin();
        birds[2].setName("King Penguin");
        //instantiate BirdHouse and create a new object: flybois
        BirdHouse flyBois = new BirdHouse();
        flyBois.observeBirds(birds);
//        flyBois.birdTriage(birds[2]);
    }
}