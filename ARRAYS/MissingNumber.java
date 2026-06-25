
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        HashSet<Integer> hp = new HashSet<>();
        for(int n : arr){
            hp.add(n);
        }
        for(int i=0;i<arr.length+1;i++){
            if(!hp.contains(i)){
                System.out.println(i);
            }
        }
        

    }

}
