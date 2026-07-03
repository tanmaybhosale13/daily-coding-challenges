package arrayprogramming.com.string.programming;

import java.util.Scanner;

public class ReversedString {

    // Write a program to reversed a given string
    public static void main(String[] args) {

    
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a input to reversed");
       String inputString=sc.next();


      StringBuilder reversedString=new StringBuilder();


      for(int i=inputString.length()-1;i>=0;i--){


         char output= inputString.charAt(i);

         reversedString.append(output);


        
      }

      System.out.println(reversedString);

      sc.close();
       

    }
}
