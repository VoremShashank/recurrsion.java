public class OnetoN {
    public static void recurrsiombasics(int n){
        if(n>100){
            return;
        }

        System.out.print(n+" ");
        recurrsiombasics(n+1);
    }
    public static void main(String[] args) {
        recurrsiombasics(1);
    }
    
}
