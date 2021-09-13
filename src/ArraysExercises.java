import java.util.Arrays;

public class ArraysExercises {




    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person jeff = new Person("Jeff");
        Person bob = new Person("Bob");
        Person pat = new Person("Pat");

        Person[] people = new Person[3];
        people[0] = jeff;
        people[1] = bob;
        people[2] = pat;

        for(Person peoples : people) {
            System.out.println(peoples.getName());

        }

        for (Person morePeople : addPerson(people, "Greg")) {
            System.out.println(morePeople.getName());
        }


    }
    public static Person[] addPerson (Person[] people, String person ) {
        Person[] addedPerson = Arrays.copyOf(people, people.length + 1);

        addedPerson[people.length] = person;

        return addedPerson;
    }
}
