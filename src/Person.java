public class Person {
//    private String name;

//    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.name = "Pat";
//        System.out.println(p1.getName());
////        System.out.println(p1.setName());
////        System.out.println(p1.sayHello());
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//    }
//    public String getName(){
////TODO: return the person's name
//        return name;
//    }
//
//    public void setName(String name){
////TODO: change the name property to the passed value
//        this.name = name;
//    }
//    public void sayHello(){
////TODO: print a message to the console using the person's name
//        System.out.println("This is the name of the perpetrator: " + name);
//    }


//public class Person {
//
    private String name;
    private int age;

    public static void progressOneYear(Person[] people) {
        for (Person person : people) {
            person.setAge(person.getAge() + 1);
        }
    }

    public static void printOutAgesOfPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person.getAge());
        }
    }

    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//}
}