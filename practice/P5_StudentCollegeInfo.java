/**
 * Week 6 Practice M5 - Student and College Information Management (static members)
 */
public class P5_StudentCollegeInfo {

    static class Student {
        static String collegeName = "SRM Institute of Science and Technology"; // shared by all students
        static int studentCount = 0;

        String name;
        double attendance;

        Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        // Uses only static fields
        static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {
        new Student("Ravi", 92.5);
        new Student("Anitha", 88.0);
        Student.printCollegeInfo(); // called through the class name
    }
}
