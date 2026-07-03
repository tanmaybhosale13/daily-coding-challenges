package arrayprogramming.com.string.programming;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

         String inputString=sc.next();


         String originalString=inputString;

         StringBuilder out=new StringBuilder();

         for(int i=inputString.length()-1;i>=0;i--){

            
              char c=inputString.charAt(i);
               

              out.append(c);
         }

         if(originalString.equals(inputString)){

            System.out.println("String is palindrome");
         }else{

            System.out.println("String is not palindrome");
         }

  

         
          




    }
}
