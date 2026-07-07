public class MaxinumSubArraySum {
    public static void main(String[] args) {
        int arr[]  = {-2,-3,4,-1,-2,1,5,-3};

        //Brtue;
        int maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+= arr[k];
                     maxsum = Math.max(maxsum, sum);
                }
            }
        }
        System.out.println(maxsum);

        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum+= arr[j];
        //         maxsum = Math.max(maxsum, sum);
        //     }
        // }
        // System.out.println(maxsum);
    }
}
