package animal;

 abstract class Animal {

  protected int age;
  protected int weight;
  protected String species;
  protected String name;

  public int getAge() {
   return age;
  }

  public void setAge(int age) {
   this.age = age;
  }

  public int getWeight() {
   return weight;
  }

  public void setWeight(int weight) {
   this.weight = weight;
  }

  public String getSpecies() {
   return species;
  }

  public void setSpecies(String species) {
   this.species = species;
  }

  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public void rest(int noOfHours) {
   for (int i = 0; i <= noOfHours; i += 1) {
    System.out.println("Zzzzzzz....");
   }
  }
  public abstract void responseToCommand(String command);
}
