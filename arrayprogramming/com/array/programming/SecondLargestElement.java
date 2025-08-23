

public class SecondLargestElement {

    // write a program to find second largest element in array
    public static void main(String[] args) {
        
        int[] num={6,7,8,15,87,51,23};
        int large=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){

            if(num[i]>large){
              secLarge=large;
              large=num[i];
            

            }else if(num[i]>secLarge && secLarge!=large){
                secLarge=num[i];
            }

         }


         System.out.println("Largest in the array :"+large);
         System.out.println("Second largest in the array :"+secLarge);
         






        
    }
}
