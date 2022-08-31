/**
 * Defines a Student object. You do not have to implement this class. 
 */
public class Student {
    private String name;
    private int height;
    private int gradeLevel;
    private String favoriteColor;
    private BankAccount bankAccount;

    // Constructors
    public Student(String name, int height, int gradeLevel, String favoriteColor, BankAccount bankAccount) {
        this.name = name;
        this.height = height;
        this.gradeLevel = gradeLevel;
        this.favoriteColor = favoriteColor;
        this.bankAccount = bankAccount;
    }

    public Student(String name, int height, int gradeLevel, String favoriteColor) {
        this(name, height, gradeLevel, favoriteColor, null);
    }

    // Getters
    public String GetName() { return name; }
    public int GetHeight() { return height; }
    public int GetGradeLevel() { return gradeLevel; }
    public String GetFavoriteColor() { return favoriteColor; }
    public BankAccount GetBankAccount() { return bankAccount; }

    // Setters
    public void SetGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }
    public void SetFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }

    // define comparison
    public boolean equals(Object other) {
        // If points to the same object, return true
        if (other == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(other instanceof Student)) {
            return false;
        }

        Student otherStudent = (Student) other;

        if (!name.equals(otherStudent.name)) {
            return false;
        }

        if (height != otherStudent.height) {
            return false;
        }

        if (gradeLevel != otherStudent.gradeLevel) {
            return false;
        }

        if (!favoriteColor.equals(otherStudent.favoriteColor)) {
            return false;
        }

        if ((bankAccount == null && otherStudent.bankAccount != null) 
            || (bankAccount != null && otherStudent.bankAccount == null)) {
            return false;
        }

        if (bankAccount != null && otherStudent.bankAccount != null && !bankAccount.equals(otherStudent.bankAccount)) {
            return false;
        }

        return true;
    }
}
