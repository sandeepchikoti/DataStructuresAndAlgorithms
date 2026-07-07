public class BestTimeToBuyAndSell{
    public static void main(String[] args) {
        int arr[] = {5,6,1,7,8};
        int profit = 0;
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            int diff = arr[i]-min;
            profit = Math.max(profit,diff);
            min = Math.min(min,arr[i]);
        }

        System.out.println(profit);
    }
}