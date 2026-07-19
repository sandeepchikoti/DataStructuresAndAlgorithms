
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        

        //BETTER APPROCH
        // HashSet<List<Integer>> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //      HashMap<Integer,Integer> map = new HashMap<>();
        //     for(int j=i+1;j<n;j++){
        //         ArrayList<Integer> ls = new ArrayList<>();
        //         int needed = -(arr[i]+arr[j]);
        //         if(map.containsKey(needed)){
        //             ls.add(arr[i]);
        //             ls.add(arr[j]);
        //             ls.add(needed);
        //             Collections.sort(ls);
        //             set.add(ls);
        //         }
        //         else if(!map.containsKey(needed)){
        //             // map.put(arr[i],i);
        //             map.put(arr[j],j);
        //         }
        //     }
        // }
        // System.out.println(set);

        //OPTIMAL APPROCH
        Arrays.sort(arr);
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left<right){
            int sum = arr[i]+arr[left]+arr[right];
            if(sum<0){
                left++;
            }
            else if(sum>0){
                right--;
            }
            else{            
                ArrayList<Integer> ls = new ArrayList<>();
                ls.add(arr[i]);
                ls.add(arr[left]);
                ls.add(arr[right]);
                list.add(ls);
                left++;
                right--;
                while(left<right && arr[left]==arr[left-1]) left++;
                while(left<right && arr[right]==arr[right+1]) right--;
            }
        }
    }
        System.out.println(list);
    }
    
}
