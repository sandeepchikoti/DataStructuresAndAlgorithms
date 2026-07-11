
import java.util.HashSet;

class LongestConsecutiveSequence{
            //Brute Approches
    // public static boolean  linearsearch(int[] arr, int num){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==num){
    //             return true;
    //         }   
    //     }
    //     return false;    
    // }
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,5,2,1};
        int n = arr.length;
        int maxCount = 1;
        // HashMap<Integer,Integer> hs = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     hs.put(arr[i],1);
        // }
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     while(hs.containsKey(arr[i])){
        //         count++;
        //         arr[i]++;
        //     }
        //     maxCount = Math.max(maxCount,count);
        // }

            // for(int i=0;i<n;i++){
            //     int count = 0;
            //     int x = arr[i];
            //     while(linearsearch(arr,x++)==true){
            //         count++;
                    
            //     }
            //      maxCount = Math.max(count,maxCount);
            // }   



      //Better Approches
    //   Arrays.sort(arr);
    //    int last_smaller = Integer.MIN_VALUE;
    //    int count = 0;
    //    for(int i=0;i<n;i++){
    //     if(arr[i]-1 == last_smaller){
    //         count++;
    //         last_smaller = arr[i];   
    //     }
    //    else if(arr[i]!=last_smaller){
    //     count = 1;
    //     last_smaller = arr[i];
    //    }
    //    maxCount = Math.max(count, maxCount);
    // }
    //   System.out.println(maxCount);  

    //OPTIMAL APPROCH
    
    HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<n;i++){
        hs.add(arr[i]);
    }
    int count = 0;
    for(int i=0;i<n;i++){
        if(!hs.contains(arr[i]-1)){
             count = 1;
            while(hs.contains(arr[i])){
                count++;
                arr[i]++;
            }
        }
        maxCount = Math.max(count,maxCount);
    }
    System.out.println(maxCount);
    }
}
