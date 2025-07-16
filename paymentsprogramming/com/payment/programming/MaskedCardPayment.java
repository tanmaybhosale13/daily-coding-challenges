package paymentsprogramming.com.payment.programming;

public class MaskedCardPayment {


       public static void main(String[] args) {
        
          
         String maskedNumber =getMaskedCardNumber("7487638757856328");


         System.out.println("Masked Number of pan is :"+maskedNumber);




       }


        
       public static String getMaskedCardNumber(String pan){

           
           int cardLength=pan.length();

            String initialNumber=pan.substring(0, 6); // visible first 6
            String endNumber=pan.substring(pan.length()-4, cardLength); //  visible last 4 
               
            StringBuilder masked=new StringBuilder(initialNumber);

            for(int i=0;i<pan.length()-10;i++){

                 masked.append("*"); // encoding middle elements as masking

            }

            masked.append(endNumber);

            return masked.toString();  



       }



}
