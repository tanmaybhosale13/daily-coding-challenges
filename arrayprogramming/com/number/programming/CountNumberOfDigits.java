package arrayprogramming.com.number.programming;

public class CountNumberOfDigits {


    // write a program to count digits in the number

    public static void main(String[] args) {
        


        int result=countNumberOfDigits(85783L);

        System.out.println("Number of digits are :"+result);



    }



    public static int  countNumberOfDigits(long num){

        int count=0;
        while(num!=0){ // this will run until it becomes zero
            count++;
            num=num/10; // gives the updated number

        }
        return count; //  return the count of digits
    }
}
