public class Array{

  //  public static int binarySearch(int arr[], int key){
  //  for(int i=0; i<=arr.length -1; i++){
  //   if(key== arr[i]){
  //     return i;
  //   }
  //  }
  //  return -1;
  //  }

  //  public static int findLargest(int arr[]){
  //      int max = Integer.MIN_VALUE ;
  //      for(int i=0; i<=arr.length -1; i++){
  //       if(max < arr[i]){
  //         max= arr[i];
  //       }

  //      }
  //      return max;
  //  }

  //  public static void reverseArray(int arr[]){
  //   int first= 0;
  //   int last= arr.length-1;
  //   while(first<last){
  //     int temp = arr[first];
  //     arr[first]= arr[last];
  //     arr[last]= temp;
  //     first++;
  //     last--;
  //   }
  //  }

    // public static void arrayPairs(int arr[]){
    //   for(int i=0; i<arr.length-1; i++){
    //     for(int j=i+1; j<arr.length; j++){
    //       System.out.print("("+ arr[i] +" ,"+ arr[j] +"),  " );
    //     }
    //     System.out.println();
    //   }
    // }

    //  Print the subarrays and their count 
public static void arraySubarray(int arr[]){
    for(int i=0; i <arr.length ; i++){
      for(int j=0; j <arr.length ; j++){
         int sum=0;
        for(int k=i; k<=j; k++){
          System.out.print(arr[k]+" ");
          sum= sum+ arr[k];
        }
        System.out.println(sum);
        
      }
      System.out.println();
    }
}
  public static void main(String args[]){
    // binary search 
    int arr[]={12,3,2,7,10,4};
    // System.out.println("The key index will be "+ binarySearch(arr, 23));

    //  find the largest 
    // System.out.print("The largest number is : "+ findLargest(arr ));

    // to reverse the array
    // reverseArray(arr);

    // for(int i=0;i<= arr.length-1;i++){
    //   System.out.print(arr[i] + " ");
    // }


    // to print the array pairs
    // arrayPairs(arr);

    // print subarrays and their count 
    arraySubarray(arr);
  }
}