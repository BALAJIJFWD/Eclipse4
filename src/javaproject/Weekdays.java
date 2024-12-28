package javaproject;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day index (0-6): ");
        int index = sc.nextInt();

        try {
            if (index < 0 || index > 6) {
                throw new ArrayIndexOutOfBoundsException("Day index is out of range (0-6).");
            }
            System.out.println("Day: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}