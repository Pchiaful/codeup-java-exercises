package birds;

public class BirdHouse {

    public void observeBirds(Bird[] birdCollection) {
        for(Bird bird: birdCollection) {
            System.out.println(bird.getName() + " goes ");
            bird.makeNoise();
        }
    }

    public void birdTriage(Bird injuredBird) {
        injuredBird.makeNoise();

    }
}