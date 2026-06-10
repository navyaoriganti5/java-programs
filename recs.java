
public class recs {

    public static void f(int n){
        if(n == 0)return;
        if(n%2 == 0)
            System.out.print(n+" ");
        f(n-1);
        if(n%2 != 0)
            System.out.print(n+" ");
    }
    public static void main(String args[]){
        f(10);
    }
}