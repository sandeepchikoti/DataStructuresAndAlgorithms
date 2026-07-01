import java.util.*;
public class HashArray {
    public static void main(String[] args) {
        int arr[] = {2,5,4,3,7,1,2,8};
        int max = -1;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
        int hash[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        System.out.println(hash[0]);
        System.out.println(hash[2]);
        System.out.println(Arrays.toString(hash));
    }
}
