package arrayprogramming.com.string.programming;

import java.util.Scanner;

public class ReversedString {

    // Write a program to reversed a given string
    public static void main(String[] args) {

    
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string for reversed");
        String input=sc.nextLine();

        StringBuilder revString=new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){

            revString.append(input.charAt(i));

        }


        System.out.println("Reversed String is :"+revString);


        sc.close();

    }
}
