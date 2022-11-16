import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        System.out.print("enter grade: ");
        int studentGrade = input.nextInt();

   if(studentGrade>=90 && studentGrade <= 100) {
       System.out.println("A");
   }
    else {
       if (studentGrade >= 80 && studentGrade <= 89) {
           System.out.println("B");
       }
       else {
           if (studentGrade >= 70 && studentGrade <= 79) {
               System.out.println("C");
           }
           else {
               if (studentGrade >= 60 && studentGrade <= 70) {
                   System.out.println("D");
               }
               else {
                   System.out.println("Failed");
               }
           }

       }
   }
    }

}
