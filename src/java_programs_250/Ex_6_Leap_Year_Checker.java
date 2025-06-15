package java_programs_250;

import java.util.Scanner;

public class Ex_6_Leap_Year_Checker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int Year=scanner.nextInt();
       if(Year%4==0 && Year%100!=0||Year%400==0){
           System.out.println("it is leap year");
       }
       else{
           System.out.println("not a leap year");
       }
    }
}
