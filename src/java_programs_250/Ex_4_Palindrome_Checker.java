package java_programs_250;

import java.util.Scanner;

public class Ex_4_Palindrome_Checker {
    //wow //mom
    public static void main(String[] args){
        String reverse_word="";
        Scanner scanner =new Scanner(System.in);
        String palindrome_word =scanner.nextLine();
        for(int i=palindrome_word.length()-1;i>=0;i--) {
            reverse_word += palindrome_word.charAt(i);
        }
            if(reverse_word.equals(palindrome_word ) ){
                System.out.println("the word is palindrome");
            }
            else{
                System.out.println("not a palindrome" );
            }




    }
}
