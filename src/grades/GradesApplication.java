package grades;

import java.util.HashMap;
import java.util.InputMismatchException ;

/**
 * Create a map for students and GitHub usernames
 *
 * Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
 * It should have keys that are strings that represent github usernames, and values that are Student objects.
 * Create at least 4 student objects with at least 3 grades each, and add them to the map.
 *
 * Be creative! Make up GitHub usernames and grades for your student objects.
 */

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student clarkKent = new Student("Clark Kent");
        clarkKent.addGrade(80);
        clarkKent.addGrade(90);
        clarkKent.addGrade(75);
        students.put("superman", clarkKent);

        Student peterParker =  new Student("Peter Parker");
        peterParker.addGrade(60);
        peterParker.addGrade(55);
        peterParker.addGrade(58);
        students.put("spiderman",peterParker);

        Student bruceWayne = new Student( "Bruce Wayne");
        bruceWayne.addGrade(90);
        bruceWayne.addGrade(95);
        bruceWayne.addGrade(98);
        students.put("batman",bruceWayne );

        Student natashaRomanova = new Student( "Natasha Romanova");
        natashaRomanova.addGrade(100);
        natashaRomanova.addGrade(100);
        natashaRomanova.addGrade(100);
        students.put("blackWidow", natashaRomanova);

        Student currentStudent;

//        System.out.println("Keys");
//        for(String key : students.keySet()) {
////            System.out.println("student = " + students.get(key));
//            currentStudent = students.get(key);
//            System.out.println("currentStudent.getName() = " + currentStudent.getName());
//            System.out.println("currentStudent.getGradeAverage() = " + currentStudent.getGradeAverage());
//
//        }
//
//        System.out.println("Val");
//        for(Student val : students.values()) {
////            System.out.println("val = " + val);
//            System.out.println("val.getName() = " + val.getName());
//            System.out.println("val.getGradeAverage() = " + val.getGradeAverage());

//        }
        System.out.println("Here are the GitHub usernames of our students:\n" +
                "\n ");
        for (String key : students.keySet()) {
            System.out.println(key);
        }



        Input keyboard = new Input();
        String answer = keyboard.getString();
//        System.out.println(answer);
//            System.out.println(students.containsKey(answer));

        if(students.containsKey(answer)) {
            System.out.println(students.get(answer).getName());
            students.get(answer).printGrades();
//            System.out.println(students.get(answer).getGradeAverage());
        } else {
            System.out.println("No student found.");
        }


    }
}
