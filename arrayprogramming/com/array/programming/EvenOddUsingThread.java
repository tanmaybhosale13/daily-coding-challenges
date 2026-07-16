

public class EvenOddUsingThread {


    //  shared variable
     private int number=1;

     private final int limit=10;

     // Only one thread can modified the resource at a  time
     public synchronized void printOdd() throws InterruptedException{

        while (number<=limit) {

            while (number%2==0) {
                wait();
                
            }

            System.out.println(Thread.currentThread().getName()+" -- "+number);
            number++;
            notify();

        }
       }

 // Only one thread can modified the resource at a time
     public synchronized void printEven() throws InterruptedException{


        while (number<=limit) {

            while (number%2!=0) {
                // pasue the current thread, release the lock and waiting thread acquires the lock to continue executing the code.
                wait();
                
            }

            System.out.println(Thread.currentThread().getName()+" -- "+number);
            number++;

            notify(); // it wake up the other waiting thread to execute the code

        
     }
     

    }





    public static void main(String[] args) {

        EvenOddUsingThread evenOddUsingThread=new EvenOddUsingThread();

        Thread odd=new Thread( () -> {

            try {
                evenOddUsingThread.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        });

        Thread even=new Thread( () -> {

            try {
                evenOddUsingThread.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        });


        odd.start();
        even.start();





        
    }

}
