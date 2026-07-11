
import java.util.Arrays;


public class DefuseBomb {
//         public static void Postive(int code[],int k){
//         int n = code.length;
//         int arr[] = new int[n+k];
//         for(int i=0;i<n;i++){
//             arr[i] = code[i];
//         }
//         int j = n;
//         for(int i=0;i<k;i++){
//             arr[j++] = arr[i];
//         }
//         for(int i=0;i<n;i++){
//             int sum = 0;
//             for(int m=i+1;m<(i+1)+k;m++){
//                 sum+=arr[m];
//             }
//             code[i] = sum;
//         }
//     }

        public static void Negitive(int code[],int k){
        int n = code.length;
        int value = -k;
        System.out.println(value);
        int arr[] = new int[n+value];
        for(int i=0;i<n;i++){
            arr[value++] = code[i];
        }
        // System.out.println(Arrays.toString(arr));
        k = -k;

        int j = 0;
        for(int i=n-k;i<n;i++){
            System.out.println(i);
            arr[j++] = code[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=k;i<n;i++){
            int sum = 0;
            int m=i-1;
            for(int count=1;count<=k;count++){
                sum+=arr[m];
                m--;
                System.out.println(m);
            }
            code[i] = sum;
        }
            System.out.println(Arrays.toString(code));
    }
        public static void main(String[] args){
             int code[] = {5,7,1,4};
             int k = -2;
             Negitive(code,k);
            //  if(k>0){
            //  Postive(code,k);
            //  }



        }
    }


    
