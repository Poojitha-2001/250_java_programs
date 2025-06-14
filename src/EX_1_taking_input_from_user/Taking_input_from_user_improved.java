package java_programs_250.taking_input_from_user;

import java.util.Scanner;

public class Taking_input_from_user_improved {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in );
        //take the input string from user
       String name= s.nextLine();
        System.out.println(name);
        //printing the int
        int age=s.nextInt();
        System.out.println(age);



    }
}
