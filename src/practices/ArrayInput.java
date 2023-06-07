package practices;

import java.util.Scanner;

public class ArrayInput {
    Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the number of students
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            // Create an array to store the grades
            double[] grades = new double[numStudents];

            // Prompt the user to enter the grades
            System.out.println("Enter the grades:");
            for (int i = 0; i < numStudents; i++) {
                grades[i] = scanner.nextDouble();
            }

            // Calculate the average grade
            double sum = 0;
            for (int i = 0; i < numStudents; i++) {
                sum += grades[i];
            }
            double average = sum / numStudents;

            // Print the average grade
            System.out.printf("The average grade is: %.2f", average);
        }
    }

