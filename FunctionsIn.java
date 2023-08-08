import java.util.*;
public class FunctionsIn{

    // function to add two numbers
 /*   public static int sum(int a, int b){
        return a+b; 
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
       int b= sc.nextInt();
       System.out.print("The sum will be "+ sum(a,b));  */

       //Swap two functions (Call by value)

    /*   public static void swapTwoNumbers(int a , int b){
              int temp = a;
              a =b ;
              b= temp;
              System.out.println("The value of a is : "+ a);
              System.out.print("The value of b is : "+ b);

       }
       public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();  
            swapTwoNumbers(a,b);

       }*/

       // Product of two numbers

      //  public static int product(int a, int b){
      //    return a*b;
      //  }
      //  public static void main(String args[]){
      //    int a =32;
      //    int b =2;
      //    System.out.print("The product will be "+ product(a,b));
      //  }

       // Calculate the binomial cofficient 

      //  public static int factorialCalculate(int n){
      //         int factorial =1;
      //         for(int i=1; i<=n; i++){
      //          factorial = factorial*i;
      //         }
      //         return factorial;
      //  }
      //  public static void calculateBinomial(int n, int r){
      //        int a = factorialCalculate(n);
      //        int b = factorialCalculate(r);
      //        int c = factorialCalculate(n-r);


      //        double binomialCofficient = a/(b*c);
      //        System.out.print("The value will be "+ binomialCofficient);
      //  }
      //  public static void main(String args[]){
         // int n= 5;
         // int r= 3;
         // calculateBinomial(n,r);                }

      //   *********************** // check the number is prime or not using functions***************************8
      //   public static boolean isPrime(long n){
      //    boolean isPrime= true;

      //    if(n<2){
      //       return false;

      //    }
      //    if(n==2){
      //       return isPrime;
      //    }
      //    for(int i=2; i<= Math.sqrt(n); i++){
      //       if(n%i== 0){
      //          return false ;
      //       }
      //    }
      //    return isPrime;
      //   }

      //   public static void printPrime(int range){
      //    for(int i=2; i<=range;i++){
      //       boolean check= isPrime(i);
      //       if(check){
      //          System.out.print(i+" ,");
      //       }
      //    }
      //   }
      //   public static void main(String args[]){
      //    Scanner sc = new Scanner(System.in);
      //    int n= sc.nextInt();
      //    printPrime(n);
         
      //   }

         //  ********************8 // Binary to decimal /******************8 */

         public static int binaryTODec(int n){
            int decimal=0;
            int pow= 0;
            int lastDigit= 0;

            while(n>0){
               lastDigit= n%10;
               decimal = decimal +(lastDigit * (int)Math.pow(2,pow));
               pow++;
               n= n/10;
            }
            return decimal;
         }
         public static void main(String args[]){
            int n =1001;
            System.out.print(binaryTODec(n));

         }
 
 
    }


