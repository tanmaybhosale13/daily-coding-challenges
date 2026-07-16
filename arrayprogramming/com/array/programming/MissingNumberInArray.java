public class MissingNumberInArray {


    public static void main(String[] args) {


        int[] numbers={3,4,5,6,7,9};


        int sum1=0;
        int sum2=0;

        // actual sum of array
        for(int i=0;i<numbers.length;i++){


            sum1=sum1+numbers[i];

        }


        for(int i=3;i<=9;i++){

            sum2=sum2+i;

        }



        System.out.print(sum2-sum1+ " : is missing number");
        




    }
}
