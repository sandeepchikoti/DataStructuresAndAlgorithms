import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {100,20,30,40,50,50};
        int arr2[] = {60,60,60,70,70,80,80,90};
        TreeSet<Integer> hs = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        int union[] = new int[hs.size()];
        int j = 0;
        for(int i : hs){
            union[j++] = i;
        }
        System.out.println(Arrays.toString(union));
    }
}
