public class CheckingArrayIsSorted {
    public static void main(String[] args) {
        int arr[]= {1,2,1,4,5};
        boolean flag = false;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
