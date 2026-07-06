public class Largest_SecondLargest_ThirdLargestElement {
    

    public static void main(String[] args) {
        

        int[] numbers={6,9,10,76,36,198,347,78,36,87};

        int largest=Integer.MIN_VALUE;
        int sec_largest=Integer.MIN_VALUE;
        int third_largest=Integer.MIN_VALUE;


        for(int num :numbers){

            if(num>largest){

                third_largest=sec_largest;
                sec_largest=largest;
                largest=num;
            }else if( num>sec_largest && num!=largest){

                third_largest=sec_largest;
                sec_largest=num;
            }else if(num>third_largest && num!=sec_largest && num!=largest){

                third_largest=num;
            }


        }


        System.out.println("largest element in array : "+largest);
        System.out.println("Second largest element in array : "+sec_largest);

        System.out.println("Third largest element in array : "+third_largest);







    }
}
