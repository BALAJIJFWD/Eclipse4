package javaproject;

import java.util.HashMap;

class StudentGrades {
    private HashMap<String, Integer> studentGrades = new HashMap<>();

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s Grade: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }
}

public class Q4Test {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        grades.addStudent("John", 85);
        grades.addStudent("Alice", 90);
        grades.displayGrade("John");
        grades.removeStudent("Alice");
        grades.displayGrade("Alice");
    }
}