package arrayprogramming.com.string.programming;

public class NonRepeatedCharacterInString {
    
    public static void main(String[] args) {
        

        String input="tanmay";
         StringBuilder nonRepeatedResult =nonReapeated(input);

         System.out.println("Non repeated characters are :"+nonRepeatedResult);


    }



    public static StringBuilder nonReapeated(String input){

        StringBuilder result=new StringBuilder();

        for(char ch:input.toCharArray()){


             if(input.indexOf(ch)==input.lastIndexOf(ch)){

                result.append(ch);

             }

        }
        return result;

    }



}
