package arrayprogramming.com.array.programming;

public class SecondSmallestElement {

    // Write a program to find the second smallest element
    public static void main(String[] args) {
        
        int[] num={16,78,65,14,23,24};

        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){


            if(num[i]<small){
                secSmall=small;
                small=num[i];

            }else if(num[i]<secSmall && small!=secSmall){
                secSmall=num[i];
            }



        }


        System.out.println("Smallest element is :"+small);
        System.out.println("Second smallest element is :"+secSmall);








    }
}
