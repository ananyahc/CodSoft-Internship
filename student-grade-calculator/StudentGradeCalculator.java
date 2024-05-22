import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter marks obtained in each subject (out of 100):");
        
        int subject1Marks = getValidMarks(scanner, "Subject 1");
        int subject2Marks = getValidMarks(scanner, "Subject 2");
        int subject3Marks = getValidMarks(scanner, "Subject 3");

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;

        // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
        double averagePercentage = (double) totalMarks / 3;

        // Grade Calculation: Assign grades based on the average percentage achieved.
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Method to get valid marks input from user.
    private static int getValidMarks(Scanner scanner, String subjectName) {
        int marks;
        while (true) {
            System.out.print(subjectName + ": ");
            if (scanner.hasNextInt()) {
                marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Please enter valid marks (0-100).");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return marks;
    }
}
