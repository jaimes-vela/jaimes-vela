package grades;
//Create a class named Student.
// It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers.
// The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
//
//
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();
//Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.


import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        System.out.println("Average:");
        int totalGrades = 0;
        for (Integer grade: this.grades){
            totalGrades += grade;

        }

        //System.out.println("totalGrades = " + totalGrades);
        return totalGrades / this.grades.size();
    }
    public void printGrades(){
        System.out.println("Grades:");
        for (Integer grade: this.grades){
            System.out.println(grade);

        }
//        return "";

    }

    public static void main(String[] args) {
        Student fer = new Student("fer");
        fer.addGrade(80);
        fer.addGrade(20);
        fer.addGrade(60);

        System.out.println(fer.getGradeAverage());

    }
}
