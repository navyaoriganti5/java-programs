public class avya{
public static void main(String[] args){
int a = 60;
int b = 130;
int diff1 = Math.abs(100-a);
int diff2 = Math.abs(100-b);
if(diff1 < diff2)
System.out.println(a);
else if(diff1 == diff2){
System.out.println("same");
}else{
System.out.println(b);
}
}
}