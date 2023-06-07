package chapterSix;

import java.util.Scanner;

public class GradeBook {
    private static Scanner scanner = new Scanner(System.in);
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public int getMaximum(){
        int highestGrade = grades[0];
        for (int grade: grades) {
            if (grade > highestGrade) highestGrade = grade;
        }
        return highestGrade;
    }public  int getMinimum(){
        int lowestGrade = grades[0];
        for (int grade:grades) {
            if (grade < lowestGrade) lowestGrade = grade;
        }
        return lowestGrade;
    }
    public double getAverage(){
        int total = 0;
        for (int grade: grades) {
            total += grade;
        } return (double) total / grades.length;
    }
    public void outputGrades(){
        System.out.printf("The grades are: %n%n");
        for (int i = 0; i < grades.length ; i++) {
            System.out.printf("Students %2d: %3d%n", i+1, grades[i]);
        }
        System.out.printf("%nAverage grade is %.2f%n", getAverage());
        System.out.printf("Total grade is %d%n", total());
        System.out.printf("Highest grade is %d%nLowest grade is %d%n", getMaximum(), getMinimum());

    }public int total(){
        int total = 0;
        for (int grade: grades) {
            total += grade;
// total =getAverage() * grades.length;
        }return total;
    }

    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.outputGrades();

    }
}
