import java.util.*;
public class Array{

    // Linear Search 

    // public static int linearSearch(int arr[] , int key){
    //     for(int i=0; i< arr.length ; i++){
    //         if(key== arr[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    

    // binary search 
   public static int binarySearch(int number[], int key){
    int si= 0;
    int ei= (number.length-1);
    while(si<=ei){
         int  mid= (ei - si )/2;

          if(number[mid] == key){
            return mid;
          }
          if(key> number[mid]){
            si=mid+1;
          }
          else{
             ei = mid-1;
          }
    }
    return -1;
   }

    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);

        // initialization 
        // 1. 
        // int arr[]= new int[3];            
        // 2.
        // int numbers[] = {1,2,43,22,43};

        // input in the array 

    //    Method 1. simple method 
    //    arr[0]= sc.nextInt();
    //    arr[1]= sc.nextInt();

    //    Method 2. taking input through loop 
    // for(int i=0;i<= arr.length -1;i++){
    //        arr[i]= sc.nextInt();
    //  }
    // }

    // To print the array we can use loop or simply print the value one by one 

    // for(int j=0; j <= arr.length-1;j++){
        // System.out.println("The value on "+ j +" index is :" + arr[j]);
    // }
// }

//   Linear Search 
    //  int arr[] ={2,4,5,7,12,14};
    //  System.out.print("The key is found in index "+ linearSearch(arr ,22) );

     // Binary search 
     int number[]= {12,34,56,67,68,96};
     System.out.print("The key is index " + binarySearch(number , 45);

}
}