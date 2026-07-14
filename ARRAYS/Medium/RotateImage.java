import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            int n = cols-1;
            for (int j = 0; j < cols; j++) {
                arr[i][j] = arr[n--][i];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
