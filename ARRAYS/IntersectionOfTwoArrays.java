import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
          //Brute Force 
        int nums1[] = {1,2,2,3,3,4,5,6};
        int nums2[] = {2,3,3,5,6,6,7};
        // // int vist[] = new int[arr2.length];
        // ArrayList<Integer> ls = new ArrayList<>();
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i]==arr2[j]){
        //             ls.add(arr1[i]);
        //             arr2[j] = 1;
        //             // System.out.println(Arrays.toString(vist));
        //             break;
        //         }
        //         if(arr2[j]>arr1[i]){
        //         break;
        //     }
        //     }
        // }
        // System.out.println(ls);

        //optimal 
        ArrayList<Integer> ls = new ArrayList<>();
        int j = 0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==nums2[j]){
                ls.add(nums1[i]);
                j++;
            }
            // if(nums2[j]>nums1[i]){
                
            // }
        }
        System.out.println(ls);
    }
}
