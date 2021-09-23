//package grades;
//
//import java.util.*;
//
//public class GradesApplication {
//    public static Map<String, Student> createStudents() {
//        Map<String, Student> students = new HashMap<>();
//        Student s1 = new Student("Student 1");
//        s1.addGrade(50);
//        s1.addGrade(75);
//        s1.addGrade(100);
//
//        Student s2 = new Student("Student 2");
//        s2.addGrade(20);
//        s2.addGrade(90);
//        s2.addGrade(100);
//
//        Student s3 = new Student("Student 3");
//        s3.addGrade(100);
//        s3.addGrade(88);
//        s3.addGrade(45);
//
//        Student s4 = new Student("Student 4");
//        s4.addGrade(100);
//        s4.addGrade(70);
//        s4.addGrade(45);
//
//        students.put("studentS1", s1);
//        students.put("studentS2", s2);
//        students.put("studentS3", s3);
//        students.put("studentS4", s4);
//
//        return students;
//    }
//
//    public static void displayUsernames(List<String> usernames) {
//        System.out.println("Here are the GitHub usernames of our students:\n");
//
//        String outputOfUsernames = "";
//        for (String username : usernames) {
//            outputOfUsernames += String.format("|%s| ", username);
//        }
//
//        System.out.println(outputOfUsernames);
//
//    }
//
//    public static void displayUser(Student student, String username) {
//        /*
//            Name: Zach - GitHub Username: zgulde
//            Current Average: 87.4
//         */
//
//        if (student != null) {
//            System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %f%n", student.getName(), username, student.getGradeAverage());
//        } else {
//            System.out.println("\nSorry, no student found with the GitHub username of \"" + username + "\".");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Welcome!\n");
//        Map<String, Student> students = createStudents();
//        Scanner sc = new Scanner(System.in);
//        String willContinue;
//
//        do {
//            // display all usernames from the map
//            List<String> usernames = new ArrayList<>(students.keySet());
//            displayUsernames(usernames);
//
//            System.out.println("\nWhat student would you like to see more information on?\n");
//            String username = sc.nextLine();
//            Student student = students.get(username);
//            displayUser(student, username);
//
//            System.out.println("\nWould you like to see another student? (enter 'y' for yes and 'n' for no)\n");
//
//            willContinue = sc.nextLine();
//
//        } while(willContinue.equalsIgnoreCase("y"));
//
//        System.out.println("\nGoodbye, and have a wonderful day!");
//
//    }
//}
