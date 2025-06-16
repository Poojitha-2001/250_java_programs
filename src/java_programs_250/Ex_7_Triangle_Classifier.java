package java_programs_250;

import java.util.Scanner;

public class Ex_7_Triangle_Classifier {
    /*Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides,
    determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
     Use an if-else statement to classify the triangle.*/
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int side1=scanner.nextInt();
        int side2=scanner.nextInt() ;
        int side3=scanner.nextInt();
        if(side1==side2&&side2==side3){
            System.out.println("equilateral");
        }
        else if(side1!=side2&&side2!=side3&&side3!=side1){
            System.out.println("scalene");
        } else if (side1==side2||side2==side3||side3==side1) {
            System.out.println("isosceles");

        }
        else{
            System.out.println("not a correct sides");

    }
    }
    }

