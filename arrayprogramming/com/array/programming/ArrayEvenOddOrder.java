public class ArrayEvenOddOrder {



    //  write a program which should order even element at first and odd element at last in one dimentional array
    public static void main(String[] args) {
        
         
          int[] num={ 76,13,56,17,8,9,10};


          int[] orderedElements=new int[num.length];

          int evenIndex=0;
          int oddIndex=num.length-1;
          for(int i=0;i<num.length;i++){


             if(num[i]%2==0){

                orderedElements[evenIndex]=num[i];  // adding element at the start of new array
                evenIndex++;
             }else{

                orderedElements[oddIndex]=num[i]; // adding element at the end of new array
                oddIndex--;
             }



          }


          for(int result:orderedElements){  // returning new array
            System.out.print(" "+result);
          }
           



          




    }
}
