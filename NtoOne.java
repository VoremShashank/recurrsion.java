public class  NtoOne{
    public static void recurrsionbasics(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        recurrsionbasics(n-1);

    }
    public static void main(String[] args) {
        recurrsionbasics(100);
    }
    
}