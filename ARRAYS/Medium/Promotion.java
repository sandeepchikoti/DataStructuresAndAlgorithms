public class Promotion {
    public static void main(String[] args) {
        String name = "sandy";
        System.out.println(name.getClass());
        System.out.println(name.getClass().getSimpleName());

        int a = 10;
        System.out.println(((Object) a).getClass().getSimpleName());

        int d = 10;
        int b = 30;
        long f = d+b;

        // System.out.println(f.getClass().getSimpleName());
        System.out.println(((Object) f).getClass()); //Auto boxing in java that primitve data type to wrapper classes

        


    }
    
}
