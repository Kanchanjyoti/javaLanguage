public class ArrayAssesment{
    public static boolean repetiotionCheck(int arr[]){
        for(int i=0;i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(curr == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int rotationByPoint(int arr[], int index, int element){
        int n= arr.length;
        int mid =0;
        int si=0;
        int ei= n-1;
        // Binary search
       while(si<=ei){

            mid=(ei -si)/2;
            if(arr[mid]==element){
                return (mid+ index +1)% n ;
            }
            if(arr[mid]< element ){
                si = mid+1;
            }
            if(arr[mid]>element){
                ei=mid-1;
            }
       }
        return -1;
    }

    public static int profitArray(int arr[]){
        int n= arr.length;
        int auxi[]= new int[n];

        auxi[n-1]=0;
          for(int j= n-2 ; j>=0; j--){
              auxi[j]=Math.max(arr[j+1], auxi[j+1]);
          }
        
        
        int max_profit= 0;
        int profit=0;

        for(int k=0; k <n; k++){
           profit = auxi[k]- arr[k];
           max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }

    // water trapped problem 

    // public static int waterTrapped(int arr){
    //     int n = arr.length;
    //   // left max 

    //   int left_max[]= new int[n];
    //   for()
    // }
    public static void main(String args[]){
        int arr[]={5,6,7,8,2,4,5}; 
        // System.out.print(repetiotionCheck(arr));
        // System.out.print(rotationByPoint(arr,3 , 7));
        System.out.print(profitArray(arr));
    }
}