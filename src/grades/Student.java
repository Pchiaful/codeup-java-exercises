package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static ArrayList<String> names;
    public static ArrayList<Integer> grades;

//constructors
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static int getGrades() {
        return grades;
    }

    public static void setGrades(int grades) {
        Student.grades = grades;
    }

    //methods
    // returns the student's name
    public String getName(String name){
       names.add(name);
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){

    }

    public static void main(String[] args) {
         List<String> studentGrades = new List<String>() {

        };
    }
}
