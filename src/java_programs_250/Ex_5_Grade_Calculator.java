package java_programs_250;

import java.util.Scanner;

public class Ex_5_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
     int Student_Grade= scanner.nextInt();
     if(Student_Grade>=80 && Student_Grade<=100){
         System.out.println("A");
     } else if (Student_Grade>=60&& Student_Grade<=79) {
         System.out.println("B");

     }
     else if(Student_Grade>=40 && Student_Grade<=59){
         System.out.println("c");
     }
     else {
         System.out.println("fail");
     }
    }
}
