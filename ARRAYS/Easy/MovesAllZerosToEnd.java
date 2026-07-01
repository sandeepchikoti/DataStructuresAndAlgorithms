import java.util.*;
public class MovesAllZerosToEnd{
    public static void main(String[] args) {
                    //Brute Force
        int arr[] = {0,1,0,3,12};
        // ArrayList<Integer> ls = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         ls.add(arr[i]);
        //     }
        // }
        // for(int i=0;i<ls.size();i++){
        //     arr[i] = ls.get(i);
        // }
        // int n = ls.size();
        // for(int i=n;i<arr.length;i++){
        //     arr[i] = 0;
        // }
        // System.out.println(Arrays.toString(arr));

        //optimal approach using two pointers

        int j = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        System.out.println(j);
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
            j++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}