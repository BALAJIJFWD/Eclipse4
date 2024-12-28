package javaproject;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        if (!name.matches("[a-zA-Z ]+")) { // Allows letters and spaces only
            throw new NameNotValidException("Name contains invalid characters.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class Q1Test {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "John Doe", 20, "Computer Science");
            System.out.println("Student created successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}