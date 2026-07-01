import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,40,50};
        int arr2[] = {20,30,30,40,50};

            //BRTUE
    //     HashSet<Integer> hs = new HashSet<>();
    //     for(int i=0;i<arr1.length;i++){
    //         hs.add(arr1[i]);
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         hs.add(arr2[i]);
    //     }
    //     int union[] = new int[hs.size()];
    //     int j = 0;
    //     for(int i : hs){
    //         union[j++] = i;
    //     }
    //     System.out.println(Arrays.toString(union));

            //OPTIMAL
    ArrayList<Integer> ls = new ArrayList<>();
    int n1 = arr1.length;
    int n2 = arr2.length;

    int i = 0;
    int j = 0;
    
    while(i<n1 && j<n2){
        if(arr1[i]<=arr2[j]){
            if(ls.isEmpty() || ls.get(ls.size()-1)!=arr1[i]){
                ls.add(arr1[i]);
            }
            i++;
        }
        else{
            if(ls.isEmpty() || ls.get(ls.size()-1)!=arr2[j]){
                ls.add(arr2[j]);
            }  
            j++;          
        }
    }
    while(j<n2){
             if(ls.isEmpty() || ls.get(ls.size()-1)!=arr2[j]){
                ls.add(arr2[j]);
            }  
            j++;        
    }
    while(i<n1){
             if(ls.isEmpty() || ls.get(ls.size()-1)!=arr1[i]){
                ls.add(arr1[i]);
            }  
            i++;  
    }
    System.out.println(ls);


}
}
