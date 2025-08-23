import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class findNumber{


    public static String findNumber(List<Integer> numbers,int k){


       String result="NO";
       Iterator<Integer> lisIterator=numbers.iterator();

       while (lisIterator.hasNext()) {

            
        if(lisIterator.next().equals(k)){

            result="YES";

        }
        
       }
        return result;

        
    }




    public static void main(String[] args) {


         List<Integer> numberList=Arrays.asList(6,89,98,10,66,123);

          String isNumberExist=findNumber(numberList, 87);

          System.out.println("Number exist in the list : "+isNumberExist);
        


    }
}





