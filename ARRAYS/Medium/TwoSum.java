import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int ans[] = new int[2];
        int target = 14;

        //Better
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = target-arr[i];
            if(hm.containsKey(key)){
                ans[0]=arr[i];
                ans[1]=key;
                break;
            }
            else{
                hm.put(arr[i],i);
            }

        }
        System.out.println(Arrays.toString(ans));

        //optimal
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                ans[0] = arr[i];
                ans[1] = arr[j];
                break;
            }
            if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(ans));
        
    }
}
