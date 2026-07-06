public class Smallest_SecondSmallest_ThirdSmallestElement {
    
    public static void main(String[] args) {
        

         int[] numbers={7,98,948,46,78,56,87,34};

         int smallest=Integer.MAX_VALUE;
         int sec_smallest=Integer.MAX_VALUE;
         int third_smallest=Integer.MAX_VALUE;


         for(int num: numbers){

            if(num<smallest){


                third_smallest=sec_smallest;
                sec_smallest=smallest;
                smallest=num;


            }else if(num<sec_smallest && num!=smallest){


                third_smallest=sec_smallest;
                sec_smallest=num;

            }else if(num<third_smallest && num!=sec_smallest && num!=third_smallest){


                third_smallest=num;
            }

         }

         
        System.out.println("smallest element in array : "+smallest);
        System.out.println("Second smallest element in array : "+sec_smallest);

        System.out.println("Third smallest element in array : "+third_smallest);




    }
}
