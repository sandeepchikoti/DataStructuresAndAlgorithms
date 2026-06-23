import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {10,10,30,30,30,40,40};
        // HashSet<Integer> hs = new LinkedHashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     hs.add(arr[i]);
        // }
        // System.out.println(hs);
        // int i = 0;
        // for(int n : hs){
        //     arr[i++] = n;
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(hs.size());

        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
