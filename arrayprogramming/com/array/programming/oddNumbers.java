import java.util.ArrayList;
import java.util.List;

public class oddNumbers {
    public static void main(String[] args) {
        


      List<Integer> result=findOddNumbersInRange(1, 10);

      for(int oddNumbers:result){

        System.out.println("Odd Numbers in range :"+oddNumbers);
      }


    }



    public static List<Integer> findOddNumbersInRange(int x, int y){

        int start=x;
        int end=y;

        List<Integer> result=new ArrayList<>();


        for(int i=start;i<=end;i++){

            if(i%2!=0){

                result.add(i);
            }
        }
        return result;
    }
}
