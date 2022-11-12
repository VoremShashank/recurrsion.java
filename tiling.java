public class tiling {
    public static int recursionbasics(int n){
        if (n==0 || n==1){
            return 1;
        }
        return recursionbasics(n-1) + recursionbasics(n-2);
    }
    public static void main(String[] args) {
        System.out.println(recursionbasics(4));
    }
    
}
