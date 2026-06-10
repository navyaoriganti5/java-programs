public class tab {
    public static void printTable(int n,int i){
        if(i == 11)return;
        System.out.println(n+" x "+i+" = "+n*i);
        printTable(n,i+1);
    }
    public static void main(String[] args) {
        printTable(9,1);
    }
}
