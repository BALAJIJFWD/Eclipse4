package javaproject;

class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

public class Q2Test {
    public static void main(String[] args) {
        try {
            Voter voter = new Voter(101, "Alice", 17); // Throws exception
            System.out.println("Voter created successfully!");
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }
    }
}