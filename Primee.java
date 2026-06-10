class Primee{
public static Boolean isPrime(int n){
for(int i=2;i<n;i++){
if(n%i==0){
return false;
}
}
return true;
}
public static void main(String args[]){
Boolean ans=isPrime(25);
System.out.println(ans);
}
}
