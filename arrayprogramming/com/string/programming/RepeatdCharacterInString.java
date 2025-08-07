package arrayprogramming.com.string.programming;

public class RepeatdCharacterInString {
    
    public static void main(String[] args) {


        String input="tanmay";
        StringBuilder repeatedResult=repeatedCharacter(input);

        System.out.println("repeated character in string "+repeatedResult);
        
    }




    public static StringBuilder repeatedCharacter(String input){

           
        StringBuilder result=new StringBuilder();

        for(char ch:input.toCharArray()){

            if(input.indexOf(ch)!= input.lastIndexOf(ch)){

                result.append(ch);
            }


        }

        return result;

    }
}
