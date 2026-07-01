import java.util.Arrays;

public class SecondLargest {
    //Brute Force
    static int BruteForce(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        int SecondLargestEle = arr[n-1];
        for(int i=n-2;i>=0;i--){
           if(arr[i]<SecondLargestEle){
            SecondLargestEle  = arr[i];
            break;
           }
        }
        return SecondLargestEle;
    }

    //Better Approach
    static int Better(int arr[]){
        int n = arr.length;
        int largest = arr[n-1];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int SecondLargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]<largest && arr[i]>SecondLargest){
                SecondLargest = arr[i];
            }
        }

      return  SecondLargest;
    }

    //optimal Approach
    static int optimal(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        int SecondLargest = -1;

        for(int i=1;i<n;i++){
            if(arr[i]>largest ){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>SecondLargest){
                SecondLargest = arr[i];
            }
        }
        return SecondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        System.out.println(BruteForce(arr));
        System.out.println(Better(arr));
        System.out.println(optimal(arr));
        
    }
}
