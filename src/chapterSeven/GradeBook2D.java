package chapterSeven;

import chapterSix.GradeBook;

public class GradeBook2D {
    private String courseName;
    private int[][] grades;
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public GradeBook2D(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public int getMaximum() {
        int highestGrade = grades[0][0];
        for (int[] studentGrade : grades) {
            for (int grade : studentGrade) {
                if (grade > highestGrade) highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public int getMinimum() {
        int lowerGrade = grades[0][0];
        for (int[] studentGrade : grades) {
            for (int grade : studentGrade) {
                if (grade < lowerGrade) lowerGrade = grade;
            }
        }
        return lowerGrade;
    }

    public double getAverage(int[] studentGrade) {
        int total = 0;
        for (int grade : studentGrade) {
            total += grade;
        }
        return (double) total / studentGrade.length;
    }
    public void outputGrade(){
        System.out.printf("The grades are: %n");
        System.out.print("           ");
        for (int test = 0; test < grades[0].length ; test++) {
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");
        System.out.format("-------------------------------------------\n");
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test:grades[student]) {
                System.out.printf("%8d", test);}
            double average  = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
            }
        System.out.println("Lowest grade in the grade book is " +getMinimum());
        System.out.println("Highest grade in the grade book is " +getMaximum());
        }

    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                               {68, 87, 90},
                                {94, 100, 90},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}};
        GradeBook2D myGrade = new GradeBook2D("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",
        myGrade.getCourseName());
        myGrade.outputGrade();
    }
    }
