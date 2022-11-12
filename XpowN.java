

public class XpowN {
    public static int recursionbasics(int x, int n){
        if(n==0){
            return 1;
        }
        return x * recursionbasics(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(recursionbasics(2, 10));
    }
    
}
