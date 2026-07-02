import java.util.Arrays;
public class SortingColors {
    public static void main(String[] args) {
        int arr[] = {2,0,1};
        int n = arr.length;
        // int count0 = 0;
        // int count1 = 0;
        //     //better approach
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count0++;
        //     }
        //     else if(arr[i]==1){
        //         count1++;
        //     }

        // }
        // for(int i=0;i<count0;i++){
        //     arr[i] = 0;
        // }
        // for(int i=count0;i<count0+count1;i++){
        //     arr[i] = 1;
        // }
        // for(int i=count0+count1;i<n;i++){
        //     arr[i] = 2;
        // }

        //optimal approach 
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<high){
            if(arr[mid]==0){
                System.out.println(arr[mid]);
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        } 


        System.out.println(Arrays.toString(arr));
    }
}
