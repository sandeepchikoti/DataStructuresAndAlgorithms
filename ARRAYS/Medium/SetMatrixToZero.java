import java.util.Arrays;

public class SetMatrixToZero {
    public static void main(String[] args) {
        int arr[][] = {{1,1,1}, {1,0,1}, {1,1,1}};
        //         Brute Force
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         if (mat[i][j] == 0) {
        //             for (int k = 0; k < mat.length; k++) {
        //                 if( mat[k][j]!=0){
        //                    mat[k][j] = -1;
        //                 }
        //             }
        //             for (int m = 0; m < mat[i].length; m++) {
        //                 if(mat[i][m]!=0){
        //                   mat[i][m] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }
        // System.out.println(Arrays.deepToString(mat));
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         if (mat[i][j] == -1) {
        //             mat[i][j]=0;
        //         }
        //     }
        // }

            //Better Approch

        // int row[] = new int[rows];
        // int column[] = new int[cols];
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         if(arr[i][j]==0){
        //             row[i] = 1;
        //             column[j] = 1;
        //         }
        //     }
        // }
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(row[i]==1 || column[j]==1){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }

        int rows = arr.length;
        int cols = arr[0].length;
        int col0 = 1;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    if(j!=0){
                        arr[i][0]=0;
                    }
                    if(j==0){
                        col0=0;
                    }
                    
                }
            }
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(arr[i][j]!=0){
                if(arr[0][j]==0 || arr[i][0]==0 ){
                    arr[i][j]=0;
                }
            }
            }
        }
        if(arr[0][0]==0){
            for(int j=0;j<cols;j++){
                arr[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<rows;i++){
                arr[i][i] = 0;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
