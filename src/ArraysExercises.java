import java.util.Arrays;

public class ArraysExercises {




    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Evie");
        people[1] = new Person("Bob");
        people[2] = new Person("Pat");

//        for(Person peoples : people) {
//            System.out.println(peoples.getName());
//        }

        System.out.println(Arrays.toString(people));
       people = addPerson(people, new Person("Gal"));
        System.out.println(Arrays.toString(people));
//                                              no idea what goes here
//        for (Person morePeople : addPerson(people, ???)) {
//            System.out.println(morePeople.getName());
//        }


    }
    public static Person[] addPerson (Person[] people, Person newPerson ) {
        Person[] addedPerson = Arrays.copyOf(people, people.length + 1);
        addedPerson[people.length] = newPerson;
        return addedPerson;
    }
}

// Arrays-fixed length
// can hold primitive values
//    Way of keeping track of a group of values of the same type
//      compared to ArrayLists-can change length
//      cannot store primitive types
