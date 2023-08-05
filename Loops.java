import java.util.* ;
public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // print number from 1 to 10 using while loop 

        int i= 1;                       // -----> initialization
        // while(i<= 10){                 // ----> condition   
        // System.out.println(i);
        // i++;                           // -------> updation

        /********************8*********************8****************************8**********/
        // print number from 1 to n while taking input from user 
        
        int n = sc.nextInt();
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }
        
        /********************8*********************8****************************8**********/
       // print the sum of first n natural numbers using while loop
        int sum;
       while(i<=n){
        sum = sum +i ;
        i++;

       }
       System.out.print(sum);

        }

    }
