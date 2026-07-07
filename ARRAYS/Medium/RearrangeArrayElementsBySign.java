import java.util.*;
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
            //Brute
        int arr[] = {-1,2,-2,3,-3};
        int n = arr.length;
        // int arr2[] = new int[n];
        // int i = 0;
        // for(int j=0;j<n;j++){
        //     if(arr[j]>0){
        //         System.out.println(i);
        //         arr2[i] = arr[j];
        //         i=i+2;
        //     }
        // }
        // int  k = 1;
        // for(int j=0;j<n;j++){
        //     if(arr[j]<0){
        //         arr2[k] = arr[j];
        //         k=k+2;
        //     }
        // }
        // System.out.println(Arrays.toString(arr2));

        //Better
        int ans[] = new int[n];
        int pp = 0;
        int np = 1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[pp] = arr[i];
                pp = pp+2;
            }
            else{
                ans[np] = arr[i];
                np = np+2;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
    
}
