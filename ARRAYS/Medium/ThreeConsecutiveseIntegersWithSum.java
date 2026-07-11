import java.util.*;
class ThreeConsecutiveseIntegersWithSum{
    public static long[] sumOfThree(long num) {
        // HashSet<Integer> hs = new HashSet<>();
        long arr[] = new long[3];
        for(int i=0;i<num;i++){
            int sum = 0;
            int x = i;
            sum = (x-1)+(x)+(x+1);
            if(sum==num){
                arr[0] = x-1;
                arr[1] = x;
                arr[2] = x+1;
                return arr;
            }    
        }
        return new long[]{};
    }
    public static void main(String[] args) {
        long result[] = sumOfThree(33);
       System.out.println(Arrays.toString(result));
    }
}