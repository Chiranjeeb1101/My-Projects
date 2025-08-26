import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");

        // Get number of subjects/assignments
        System.out.println("How many grades would you like to enter?");
        int numberOfGrades = scanner.nextInt();

        // Input grades
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter grade for subject/assignment " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        // Calculate average grade
        double averageGrade = calculateAverage(grades);
        String letterGrade = calculateLetterGrade(averageGrade);
        double gpa = calculateGPA(averageGrade);

        // Display results
        System.out.println("\n--- Grade Summary ---");
        System.out.println("Grades entered: " + grades);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }

    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to calculate letter grade
    public static String calculateLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to calculate GPA (assuming a 4.0 scale)
    public static double calculateGPA(double average) {
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
