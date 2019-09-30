package grades;

import java.util.HashMap;
import java.util.InputMismatchException;

/**
 * Create a map for students and GitHub usernames
 * <p>
 * Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
 * It should have keys that are strings that represent github usernames, and values that are Student objects.
 * Create at least 4 student objects with at least 3 grades each, and add them to the map.
 * <p>
 * Be creative! Make up GitHub usernames and grades for your student objects.
 */

public class GradesApplication {
    public static void main(String[] args)

    {
        boolean yesNo;
        HashMap<String, Student> students = new HashMap<>();

        Student clarkKent = new Student("Clark Kent");
        clarkKent.addGrade(80);
        clarkKent.addGrade(90);
        clarkKent.addGrade(75);
        clarkKent.recordAttendance("2017-01-01", "H");
        clarkKent.recordAttendance("2017-03-01", "P");
        clarkKent.recordAttendance("2017-05-01", "P");
        students.put("superman", clarkKent);

        Student peterParker = new Student("Peter Parker");
        peterParker.addGrade(60);
        peterParker.addGrade(55);
        peterParker.addGrade(58);
        peterParker.recordAttendance("2017-01-01", "A");
        peterParker.recordAttendance("2017-03-01", "A");
        peterParker.recordAttendance("2017-05-01", "A");
        students.put("spiderman", peterParker);

        Student bruceWayne = new Student("Bruce Wayne");
        bruceWayne.addGrade(90);
        bruceWayne.addGrade(95);
        bruceWayne.addGrade(98);
        bruceWayne.recordAttendance("2017-01-01", "P");
        bruceWayne.recordAttendance("2017-02-01", "P");
        bruceWayne.recordAttendance("2017-05-01", "A");
        bruceWayne.recordAttendance("2017-06-01", "P");
        bruceWayne.recordAttendance("2017-03-01", "P");
        bruceWayne.recordAttendance("2017-10-01", "A");
        students.put("batman", bruceWayne);

        Student natashaRomanova = new Student("Natasha Romanova");
        natashaRomanova.addGrade(100);
        natashaRomanova.addGrade(100);
        natashaRomanova.addGrade(100);
        natashaRomanova.recordAttendance("2017-01-01", "P");
        natashaRomanova.recordAttendance("2017-02-01", "P");
        natashaRomanova.recordAttendance("2017-05-01", "P");
        natashaRomanova.recordAttendance("2017-06-01", "P");
        natashaRomanova.recordAttendance("2017-03-01", "P");
        natashaRomanova.recordAttendance("2017-10-01", "P");
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

        do {
/**
 *
 * Welcome!
 *
 * Here are the GitHub usernames of our students:
 *
 * |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
 *
 * What student would you like to see more information on?
 *
 * > pizza
 *
 * Sorry, no student found with the GitHub username of "pizza".
 *
 * Would you like to see another student?
 *
 * > y
 *
 * What student would you like to see more information on?
 *
 * > zgulde
 *
 * Name: Zach - GitHub Username: zgulde
 * Current Average: 87.4
 *
 * Would you like to see another student?
 *
 * > no
 *
 * Goodbye, and have a wonderful day!
 */

            System.out.format("Welcome!\n\n");
            System.out.format("Here are the GitHub usernames of our students:\n\n");
            for (String key : students.keySet()) {
                System.out.print(" |" + key + "| ");
            }
            System.out.printf("\n\nWhat student would you like to see more information on?\n\n");
            Input keyboard = new Input();
            String answer = keyboard.getString();

            if (students.containsKey(answer)) {
                System.out.println("Name : " + students.get(answer).getName() + " - GitHub Username: " + answer);
                System.out.println( students.get(answer).getGradeAverage());
                students.get(answer).printGrades();
                System.out.println("Student attendance : " + students.get(answer).attendancePercentage());
                System.out.println("The student was absent on : " + students.get(answer).daysAbsent());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of " + "\"" + answer + "\"");
            }

            yesNo = keyboard.yesNo("\n\nWould you like to see another student Y/N?\n");
        } while (yesNo);

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
