package arrayprogramming.com.number.programming;

public class ReversedNumber {


    // write a program to reversed a number
    public static void main(String[] args) {
        
         

 
         int result=reversedNumber(1873);

         System.out.println("Reversed number is :"+result);


    }


    public static int reversedNumber(int num){


         int rev=0;
          while(num!=0){ //  this will run until it becomes 0 

            int rem= num % 10; //  return the remainder
            rev= rev * 10 + rem;
            num= num /10;


          }
          return rev;
    }
}
