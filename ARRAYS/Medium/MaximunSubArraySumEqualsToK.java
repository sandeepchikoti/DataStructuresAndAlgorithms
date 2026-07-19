public class MaximunSubArraySumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int count = 0;
        int m  = 2;
        //BRUTE APPROCH
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                // for(int k=i;k<=j;k++){
                //     sum+=arr[k];
                // }
                sum+=arr[j];
                if(sum==m){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
