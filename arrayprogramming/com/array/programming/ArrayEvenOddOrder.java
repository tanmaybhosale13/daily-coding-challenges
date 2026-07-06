public class ArrayEvenOddOrder {



    //  write a program which should order even element at first and odd element at last in one dimentional array
    public static void main(String[] args) {
        
         
          int[] num={ 76,13,56,17,8,9,10};

          int[] orderedArray=new int[num.length];


          int even=0;
          int odd=num.length-1;

          for(int i=0;i<num.length;i++){

            if(num[i]%2==0){

               orderedArray[even]=num[i];
               even++;
            }else{

               orderedArray[odd]=num[i];
               odd--;
            }
         
         }


         for(int result:orderedArray){

            System.out.println(result);
         }



          




    }
}
