package arrayprogramming.com.number.programming;

public class GetNthFibonnacciNumber {
   public static void main(String[] args) {
    



      int result=getNthFibonacciOnPosition(7);
      System.out.println("result of nth fibonacci is :"+result);



}


     public static int getNthFibonacciOnPosition(int num){
         
      if(num<=0){
         return -1;
      }

      if(num==1){
         return 1;
      }

      if(num==2){
         return 1;
      }


        int a=1;
        int b=1;

        int fib=0;

       
         
        for(int i=3;i<=num;i++){


            fib=a+b;

             a=b;
             b=fib;

        }
        return b;


     }
     

}
