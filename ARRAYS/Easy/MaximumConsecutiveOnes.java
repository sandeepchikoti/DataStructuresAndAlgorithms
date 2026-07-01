public class MaximumConsecutiveOnes{
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        int max = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            // System.out.println(count);
            if(arr[i]!=1){
                count = 0;
            }
            if(count>max){
                max = count;
            }
        }
        System.out.println(max);
    }
}