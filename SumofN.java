public class SumofN {
    public static int recursionbasics(int n){
        if(n==1){
            return 1;
        }
        return n+ recursionbasics(n-1);
    

    }
    public static void main(String[] args) {
      System.out.println( recursionbasics(5));
    }
    
}
