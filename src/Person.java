public class Person {
    private String name;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Pat";
        System.out.println(p1.getName());
//        System.out.println(p1.setName());
//        System.out.println(p1.sayHello());
    }

    public Person() {
        System.out.println("Kip");
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("This is the name of the perpetrator: " + name);
    }
}
