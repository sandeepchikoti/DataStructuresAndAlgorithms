import java.util.*;
public class FourSum {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int n = nums.length;
        Arrays.sort(nums);
        int target = 0;
         ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int left = j+1;
                int right = n-1;
                // int j = n-1;
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right]+nums[j];
                    if(sum==target){
                        ArrayList<Integer> ls = new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[left]);
                        ls.add(nums[right]);
                        System.out.println(nums[i]);
                        list.add(ls);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                } 
            }
        }
        System.out.println(list);
    }
}
