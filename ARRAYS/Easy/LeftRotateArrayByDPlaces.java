import java.util.*;
public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int  n = arr.length;
        int d = 2;
        int temp[] = new int[d];
        for(int i=0;i<temp.length;i++){
            temp[i] = arr[i]; 
        }
         for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
         }
         System.out.println(Arrays.toString(arr));
         int j = 0;
         for(int i=n-d;i<n;i++){
            arr[i] = temp[j];
            j++;
         }
         System.out.println(Arrays.toString(arr));
    }
}
