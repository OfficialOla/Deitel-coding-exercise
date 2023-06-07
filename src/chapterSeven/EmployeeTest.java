package chapterSeven;

public class EmployeeTest {
    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
        Date birthdate = new Date(2, 11, 1989);
        Date hiredate = new Date(3, 12, 2005);
        Employee employee = new Employee("Akindele.", "Joseph", birthdate, hiredate);
        System.out.println(employee);

    }
}
