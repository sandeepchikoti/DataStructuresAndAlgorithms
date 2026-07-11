
import java.util.ArrayList;

public class LeadesInAnArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,0,6};
        int n = arr.length;

             //Brute
        ArrayList<Integer> list = new ArrayList<>(); 
        // for(int i=0;i<n;i++){
        //     boolean value = true;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             value = false;
        //             break;
        //         }
        //     }
        //     if(value==true){
        //         list.add(arr[i]);
        //     }
        // }
        // System.out.println(list);

        // optimal
        int max = Integer.MIN_VALUE;
        int j = n-1;
        while(j>=0){
            if(arr[j]>max){
                max = arr[j];
                list.add(max);
            }
            j--;    
        }
        System.out.println(list);
    }
  
}
