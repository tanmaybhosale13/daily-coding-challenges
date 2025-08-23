

//Write a program to find average of array. 
public class AverageOfArray {


      public static void main(String[] args) {
        
        int[] num={2,3,5,6,8,4};

        int sum=0;

        for(int i=0;i<num.length;i++){

            sum=sum+num[i]; // sum of elements
        }

  


        float averageOfArray=(float)sum/num.length; // average of elements

        System.out.println("average of array is :"+averageOfArray);






      }



}
