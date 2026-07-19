import java.util.ArrayList;

public class PascalTriangleRow {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int arr[][] = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        int n = 5;
        int ans = 1;
        list.add(ans);
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/(i);
            list.add(ans);
        }
        System.out.println(list);

    }
}
