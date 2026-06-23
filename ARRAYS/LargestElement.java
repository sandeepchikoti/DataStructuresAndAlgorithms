public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {15,20,8,30};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
