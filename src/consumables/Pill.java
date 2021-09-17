package consumables;

public class Pill {
    private String medicationName;
    private String pharmacistInstructions;

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getPharmacistInstructions() {
        return pharmacistInstructions;
    }

    public void setPharmacistInstructions(String pharmacistInstructions) {
        this.pharmacistInstructions = pharmacistInstructions;
    }

    public Pill(String medicationName, String pharmacistInstructions) {
        this.medicationName = medicationName;
        this.pharmacistInstructions = pharmacistInstructions;
    }
// getters setters constructors...

    public void consume() {
        System.out.println("Drink down with fluid");
    }

    public void checkIfExpired() {
        System.out.println("Check expiration date on pill bottle");
    }

    public void throwAway() {
        System.out.println("Wash down sink...");
    }
}
