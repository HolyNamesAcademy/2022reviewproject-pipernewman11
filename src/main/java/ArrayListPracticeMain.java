import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListPracticeMain {
    /**
     * This is a test function for you to test your functions.
     */
    public static void Run() {
        // Use this space to test ArrayListPractice
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        ArrayList<Student> students = CreateStudentArrayList();

        /* Call ArrayListPractice functions here. For example:

        String favoriteColor = ArrayListPractice.GetFavoriteColorOfStudent(students, "Madison");
        System.out.println(favoriteColor);
         */
    }

    /**
     * @return an ArrayList of numbers.
     */
    public static ArrayList<Integer> CreateIntegerArrayList() {
        return new ArrayList<Integer>(Arrays.asList(5, 18, 3, 2, 6, 7, 9, 22, 10));
    }

    /**
     * @return an ArrayList of students with bank accounts.
     */
    public static ArrayList<Student> CreateStudentArrayList() {
        return CreateStudentArrayList(new String[]{"Emily", "Joshua", "Jessica", "Michael", "Daniel", "Madison"});
    }

    /**
     * @return an ArrayList of students without bank accounts.
     */
    public static ArrayList<Student> CreateStudentArrayListNoBankAccount() {
        return CreateStudentArrayListNoBankAccount(new String[]{"Emily", "Joshua", "Jessica", "Michael", "Daniel", "Madison"});
    }

    /**
     * @param studentNames takes a list of student names from below list of students and returns the corresponding
     *                     student objects with bank accounts
     * @return an ArrayList of numbers.
     */
    public static ArrayList<Student> CreateStudentArrayList(String[] studentNames) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("Emily", new Student("Emily", 65, 11, "blue", new BankAccount("Emily", 100)));
        students.put("Joshua", new Student("Joshua", 67, 12, "orange", new BankAccount("Joshua", 120)));
        students.put("Jessica", new Student("Jessica", 56, 11, "yellow", new BankAccount("Jessica", 200)));
        students.put("Michael", new Student("Michael", 60, 9, "green", new BankAccount("Michael", 50)));
        students.put("Daniel", new Student("Daniel", 70, 10, "purple", new BankAccount("Daniel", 75)));
        students.put("Madison", new Student("Madison", 68, 12, "red", new BankAccount("Madison", 110)));

        ArrayList<Student> result = new ArrayList<>();
        for (String student : studentNames) {
            if (students.containsKey(student)) {
                result.add(students.get(student));
            }
        }
        return result;
    }

    /**
     * @param studentNames takes a list of student names from below list of students and returns the corresponding
     *                     student objects without bank accounts
     * @return an ArrayList of numbers.
     */
    public static ArrayList<Student> CreateStudentArrayListNoBankAccount(String[] studentNames) {
        HashMap<String, Student> studentsNoBankAccount = new HashMap<>();
        studentsNoBankAccount.put("Emily", new Student("Emily", 65, 11, "blue"));
        studentsNoBankAccount.put("Joshua", new Student("Joshua", 67, 12, "orange"));
        studentsNoBankAccount.put("Jessica", new Student("Jessica", 56, 11, "yellow"));
        studentsNoBankAccount.put("Michael", new Student("Michael", 60, 9, "green"));
        studentsNoBankAccount.put("Daniel", new Student("Daniel", 70, 10, "purple"));
        studentsNoBankAccount.put("Madison", new Student("Madison", 68, 12, "red"));

        ArrayList<Student> result = new ArrayList<>();
        for (String student : studentNames) {
            if (studentsNoBankAccount.containsKey(student)) {
                result.add(studentsNoBankAccount.get(student));
            }
        }
        return result;
    }
}
