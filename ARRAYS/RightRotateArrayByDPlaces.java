import java.util.*;
public class RightRotateArrayByDPlaces {
    public static void main(String[] args) {
        int arr[] = {-1};
        int k = 2;
        int temp[] = new int[k];
        int n = arr.length;
        k = k%n;
        if(k==0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int i = 0;
        for(int j=n-k;j<arr.length;j++){
            temp[i] = arr[j];
            i++;
        }
        
        for(int f=n-k-1;f>=0;f--){
            arr[f+k] = arr[f];
            System.out.println(arr[f]);
        }
        for(int m=0;m<temp.length;m++){
            arr[m] = temp[m];  
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
