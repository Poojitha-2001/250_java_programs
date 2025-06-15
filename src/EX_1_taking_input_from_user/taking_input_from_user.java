package EX_1_taking_input_from_user;

import java.util.Scanner;

public class taking_input_from_user {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int B= s.nextInt() ;
       int C=s.nextInt() ;
       int A=B+C;
        System.out.println(A);
    }
}
