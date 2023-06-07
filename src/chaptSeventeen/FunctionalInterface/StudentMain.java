package chaptSeventeen.FunctionalInterface;

import java.util.*;
import java.util.stream.Stream;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student studentOne = new Student("Yinka", 20);
        students.add(studentOne);
        Student studentTwo = new Student("Fola", 20);
        students.add(studentTwo);
        Student studentThree = new Student("James", 19);
        students.add(studentThree);
        Student studentFour = new Student("Idris", 30);
        students.add(studentFour);
        Student studentFive = new Student("Ik",40 );
        students.add(studentFive);
        Comparator<Student> comparingByAge = Comparator.comparing(Student::getAge).thenComparing(Student::getName);
        students.sort(comparingByAge);
        for (Student student: students) {
            System.out.println(student.getAge() +", " + student.getName()) ;
        }
    }
}
