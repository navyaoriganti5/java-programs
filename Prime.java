public class Prime{
public static void main(String args[]){
int n=345;
Boolean isPrime=true;
for(int i=2;i<n;i++){
if(n%i==0){
isPrime=false;
}
}
if(isPrime){
System.out.println("number is prime");
}else{
System.out.println("number is not prime");
}
}
}