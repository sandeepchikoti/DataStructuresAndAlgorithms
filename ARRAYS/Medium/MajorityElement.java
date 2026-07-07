public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {7,7,5,7,5,1,5,7,7,5,5,5,5};
        int n = nums.length;
        int i = 0;
        // int j = 0;
        int count = 0;
        System.out.println(count);
        for(int j=i;j<n;j++){
            if(nums[i]==nums[j]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                i = j+1;
            }
        }
         System.out.println("count: "+count);
         System.out.println(nums[i]);

    }
    
}
