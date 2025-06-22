


public class AdditionOfTwoDimentionalArray {


     // write a program for Addition of two dimentional array
    public static void main(String[] args) {
         
        int[][] a={ {4,5,7},{8,5,3}};
        int[][] b={{5,8,9},{6,8,2}};


        // outer loop indicate row
        for(int i=0;i<a.length;i++){

            // inner loop indicate column  
            for(int j=0;j<a[i].length;j++){

                int sum= a[i][j]+b[i][j];  

                System.out.print(" "+sum); // addition of two dimentional array gives result


            }

            System.out.println();   // gives result of second row from both 2D array in the next line. 
        }



    }
}
