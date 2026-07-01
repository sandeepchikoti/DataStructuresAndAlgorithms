public class LongestSubArraysWithSumk{
    public static void main(String[] args) {
        int arr[] = {1,2,4,1,1,1,1,1,4};
        int n = arr.length;
        int k  = 5;

        //Brtue
        // int length = 0;
        // for(int i=0;i<arr.length;i++){
        //     int sum = 0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             length = Math.max(length,j-i+1);
        //         }
        //     }
        // }
        // System.out.println(length);

        //Better(using prefix sum and hashtable it work for all the postives and negative values)
        


        //optimal (It only work for postivies and smaller length)
        int left = 0;
        int right = 0;
        int length = 0;
        int sum = arr[0];
        while(right<n){
            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
                if(sum==k){
                    length = Math.max(length,(right-left)+1);
                }
                right++;
                if(right<n) sum+=arr[right];
            }
            System.out.println(length); 
        }
       
    }
