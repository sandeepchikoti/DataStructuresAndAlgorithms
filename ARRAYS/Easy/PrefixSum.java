import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        int arr[]  = {10,20,30,40,50};
        int PrefixSum[] = new int[arr.length];
         PrefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            PrefixSum[i] = PrefixSum[i-1]+arr[i];
        }
        System.out.println("PrefixSumArray: "+Arrays.toString(PrefixSum));
    }
    
}
