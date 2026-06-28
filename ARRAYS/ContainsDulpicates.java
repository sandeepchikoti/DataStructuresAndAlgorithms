
import java.util.HashMap;

public class ContainsDulpicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3};
        int k = 2;
        boolean flag = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                if(Math.abs(value-i)<=k){
                    flag = true;
                    break;
                    }
                else{
                    // System.out.println(false);
                    flag = false;
                    
                }
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(flag);
    }
}
