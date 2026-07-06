public class EvenOddTwoPointer {
    
    public static void main(String[] args) {
        
        int[] numbers={6,9,17,20,28,43,34};

        int left=0;
        int right=numbers.length-1;


        while(left<right){


            //  move left until we found odd element
            while (left<right && numbers[left]%2==0) {

                left++;
                
            }

            // move right until we found even element
            while (left<right && numbers[right]%2!=0) {

                right--;
                
            }

            // if we found odd element at left side swap it. if we found even element at right side traversal swap it. 

            if(left<right){

                int temp=numbers[left];
                numbers[left]= numbers[right];
                numbers[right]=temp;
                left++;
                right--;
            }



        }


        for (int n : numbers) {
            System.out.print(n + " ");
        }






    }
}
