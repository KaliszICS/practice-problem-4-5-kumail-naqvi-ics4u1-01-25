/**
 * Represents a Student with a name, age, and student number
 * @author Kumail
 * @version 1.0
 */
public class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructs a Student with name, age, and student number
     *
     * @param name          student name
     * @param age           student age
     * @param studentNumber student number
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /** 
     * @return name 
    */
    public String getName() {
        return name;
    }

    /** 
     * @return age 
    */
    public int getAge() {
        return age;
    }

    /** 
     * @return studentNumber 
    */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Returns name, age - studentNumber
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }

    /**
     * Students are equal if their student numbers match
     *
     * @param obj other object
     * @return true if student numbers match
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        if (this.studentNumber == null && other.studentNumber == null) {
            return true;
        }
        if (this.studentNumber == null || other.studentNumber == null) {
            return false;
        }
        return this.studentNumber.equals(other.studentNumber);
    }
}