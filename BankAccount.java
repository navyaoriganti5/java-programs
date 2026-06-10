import java.util.ArrayList;

public class BankAccount {
    public static String BankName  = "SAM_Bank";
    public static String name;
    public static int accountNo;
    public static int balance;
    public static long phoneNo;
    public static String ifscCode = "IBN04435AB";
    public static String id;
    public static ArrayList<String> passBook;
    public BankAccount(String nam,long phno,String idNo){
        name=nam;
        phoneNo=phno;
        id=idNo;
        balance =0;
        accountNo =Main.generateAccountNo(phno,nam);
        passBook = new ArrayList<>();
        System.out.println("dear"+name+",your bank account has created");
    }
        
   public void deposit(int money,int accNo){
        if(accountNo == accNo){
            balance += money;
            passBook.add(money + " credited");
            System.out.println(money + " credited successfully");
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void checkBalance(int accNo){
        if(accountNo == accNo){
            System.out.println("dear " + name +" your account balance is "+balance);
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void withDraw_ATM(){
        System.out.println("please insert your debit card");
        System.out.println("Enter your pin");
        Scanner sc  = new Scanner(System.in);
        if(sc.nextInt() == atm_pin){
            System.out.println("Enter the amount");
            int amount = sc.nextInt();
            if(balance >= amount){
                balance -= amount;
                passBook.add(amount + "debited");
                System.out.println("do you want to display your balance enter 1 for yes 0 for exit");
                if(sc.nextInt() == 1){
                    System.out.println("your account balance is " + balance);
                }else{
                    System.out.println("thanks for using this atm");
                }
                System.out.println("please take your cash and card");
            }else{
                System.out.println("insufficient balance");
            }
        }else{
            System.out.println("something went wrong");
        }
        sc.close();
    }
}


    public class Main{
        public static int generateAccountNo(long phno,String nam){
            int last6 = (int)(phno%1000000);
            int asciisum =0;
            for(int i =0;i<nam.length();i++){
                asciiSum += nam.charAt(i);
            }
            return last6 + asciiSum+562;
        }
        public static void main(String[] args) {
            BankAccount acc1 = new BankAccount("Avya",9963588165L,"fre4rthrt");
            acc1.deposit(1000,991193);
            acc1.withDraw_ATM();
        }
    }
    
    






    
