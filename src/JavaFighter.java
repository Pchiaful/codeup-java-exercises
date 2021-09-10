public class JavaFighter {
    // instance variables
        public String name;
        public int hitPoints;
        public int maxDamage;
    // methods
        public void printStats(){
            System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
        }

        public void battleRoar() {
            System.out.println("My name is " + name + ", and I will hear the lamentations of the vvomen.");
        }

        public int attackRoll() {
            return  D20.roll20();
        }

}