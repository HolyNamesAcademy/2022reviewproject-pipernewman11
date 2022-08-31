import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class ArrayListPracticeExtraCreditTest {
    @Test
    public void UpdateGradeLevels() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();

        // Act
        ArrayListPractice.UpdateGradeLevels(students);

        // Assert
        assertEquals(4, students.size());
        assertEquals(12, students.get(0).GetGradeLevel());
        assertEquals(12, students.get(1).GetGradeLevel());
        assertEquals(10, students.get(2).GetGradeLevel());
        assertEquals(11, students.get(3).GetGradeLevel());
    }

    @Test
    public void SortByGradeAndName() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();

        // Act
        ArrayListPractice.SortByGradeAndName(students);

        // Assert
        ArrayList<Student> expected = new ArrayList<>(
                Arrays.asList(
                        new Student("Michael", 60, 9, "green"),
                        new Student("Daniel", 70, 10, "purple"),
                        new Student("Emily", 65, 11, "blue"),
                        new Student("Jessica", 56, 11, "yellow"),
                        new Student("Joshua", 67, 12, "orange"),
                        new Student("Madison", 68, 12, "red")
                ));
        assertEquals(expected, students);
    }
}
