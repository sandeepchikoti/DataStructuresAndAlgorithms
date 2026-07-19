public class PascalTriangleElement {
        static void ncr(int r, int c){
            r=r-1;
            c=c-1;
            long result = 1;
            for(int i=0;i<=c;i++){
            result  = result*(r-i);
            result = result/(i+1);
        }
       System.out.print(result);     
        }
    public static void main(String[] args) {
       int[][] arr = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1},{1,5,10,10,1}};
       ncr(5,1);
       ncr(5,2);
       ncr(5,3);
       ncr(5,4);
       ncr(5,5);
    //    ncr(5,5);
    //    ncr(5,6);
        System.out.println();
       for(int i=1;i<=5;i++){
        ncr(5,i);
       }     
    }
}
