import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeMain {
    public static void Run() {
        // Use this space to test ArrayListPractice
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        ArrayList<Student> students = CreateStudentArrayList();

        /* Call ArrayListPractice functions here. For example:

        String favoriteColor = ArrayListPractice.GetFavoriteColorOfStudent(students, "Madison");
        System.out.println(favoriteColor);
         */
    }

    public static ArrayList<Integer> CreateIntegerArrayList() {
        return new ArrayList<Integer>(Arrays.asList(5, 18, 3, 2, 6, 7, 9, 22, 10));
    }

    public static ArrayList<Student> CreateStudentArrayList() {
        return new ArrayList<>(
                Arrays.asList(
                        new Student("Emily", 65, 11, "blue", new BankAccount("Emily", 100)),
                        new Student("Joshua", 67, 12, "orange", new BankAccount("Joshua", 120)),
                        new Student("Jessica", 56, 11, "yellow", new BankAccount("Jessica", 200)),
                        new Student("Michael", 60, 9, "green", new BankAccount("Michael", 50)),
                        new Student("Daniel", 70, 10, "purple", new BankAccount("Daniel", 75)),
                        new Student("Madison", 68, 12, "red", new BankAccount("Madison", 110))
                ));
    }

    public static ArrayList<Student> CreateStudentArrayListNoBankAccount() {
        return new ArrayList<>(
                Arrays.asList(
                        new Student("Emily", 65, 11, "blue"),
                        new Student("Joshua", 67, 12, "orange"),
                        new Student("Jessica", 56, 11, "yellow"),
                        new Student("Michael", 60, 9, "green"),
                        new Student("Daniel", 70, 10, "purple"),
                        new Student("Madison", 68, 12, "red")
                ));
    }
}
