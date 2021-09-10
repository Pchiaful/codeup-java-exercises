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

        public JavaFighter() {

        }
        public JavaFighter(String name, int hitPoints, int maxDamage) {
            System.out.println("A new fighter approaches.");
            this.name = name;
            this.hitPoints = hitPoints;
            this.maxDamage = maxDamage;
            this.printStats();
        }

//    private int hitPoints;
//
//    public void setHitPoints(int hitPoints) {
//        this.hitPoints = hitPoints;
//    }
//
//    public int getHitPoints() {
//        return hitPoints;
//    }
}