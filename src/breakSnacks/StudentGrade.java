package breakSnacks;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        numberOfStudentsAndSubjects();


    }
    public static void numberOfStudentsAndSubjects(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the numbers of student? ");
        String numberOfStudents = scanner.nextLine();
        System.out.println("What's the numbers of subject? ");
        int numberOfSubjects = scanner.nextInt();
    }
}
