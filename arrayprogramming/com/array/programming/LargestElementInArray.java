package arrayprogramming.com.array.programming;

public class LargestElementInArray {


    // Write a program to find the largest element in array

    public static void main(String[] args) {
        
        int[] num={5,8,9,31,2,10};

        int large=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){

            if(num[i]>large){
                large=num[i];
            }
        }


        System.out.println("largest element in array is :"+large);




         




    }
}
