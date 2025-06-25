package arrayprogramming.com.array.programming;

public class SmallestElement {


    // Write a program to find smallest element in array
    public static void main(String[] args) {
        
        int[] num={6,7,18,19,20,41,43};

        int small=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){

            if(num[i]<small){
                small=num[i];

            }

        }


        System.out.println("Smallest element in array is :"+small);







    }
}
