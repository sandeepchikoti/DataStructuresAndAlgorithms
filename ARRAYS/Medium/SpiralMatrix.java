
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0;i<cols;i++){
            if(!ls.contains(arr[0][i])){
                ls.add(arr[0][i]);
            }
        }

        for(int i=0;i<rows;i++){
            if(!ls.contains(arr[i][cols-1])){
                ls.add(arr[i][cols-1]);
            }
        }

        for(int i=0;i<cols;i++){
            if(!ls.contains(arr[rows-1][i])){
                ls.add(arr[rows-1][i]);
            }
        }

        for(int i=0;i<rows;i++){
            if(!ls.contains(arr[i][0])){
                ls.add(arr[i][0]);
            }
        }
        for(int i=0;i<cols;i++){
            if(!ls.contains(arr[rows/2][i])){
                ls.add(arr[rows/2][i]);
            }
        }
        System.out.println(ls);
    }
}
