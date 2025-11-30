import java.util.Scanner;

class BankAccount{
private int accountID;
private int balance;

    public int getAccountID() {return accountID;}
    public void setAccountID(int accountID) {this.accountID = accountID;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}

    public BankAccount(int accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }
    public void deposit(int amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println(amount+" dollars has been deposited to your account!");
        }
        else{
            System.out.println("You cant deposit a money less than zero!");
        }
    }
    public void withdraw(int amount){
        int a;
        if(amount<0){
            System.out.println("You cant deposit a money less than zero!");
        }else{
            if(this.balance>amount){
                this.balance-=amount;
                System.out.println(amount+" dollars has been withdrawed from your account!");
            }else{
                do{
                    System.out.println("You have 2 options.If you want to go into borrowing,please enter 1.");
                    System.out.println("But if you want to not go into borrowing,please enter 2.");
                    Scanner sc=new Scanner(System.in);
                    a= sc.nextInt();
                    if(a==1){
                        this.balance-=amount;
                        System.out.println("Now you owe "+(-this.balance)+" dollars to the bank!");
                        break;
                    }
                    else if(a==2){
                        System.out.println("Insufficient balance!");
                        break;
                    }
                    else {
                        System.out.println("Wrong operation number choice!");

                    }
                }while(a!=1 || a!=2);
            }
        }
    }
    public void accountDetails(int accountID,int balance){
        System.out.println("Your account ID: "+ accountID);
        System.out.println("Your current balance: "+ balance);
    }
    public void changeAccountID(int accountID){
        System.out.println("Your current ID is: "+accountID);
        Scanner sc=new Scanner(System.in);
        this.accountID=accountID;

    }
}
public class BankDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount b1=new BankAccount(12345,200);
        BankAccount b2=new BankAccount(12346,100);
        int option;
        do{
            System.out.println("Please select one of the 4 options from below or quit.");
            System.out.println("1-)Deposit");
            System.out.println("2-)Withdraw");
            System.out.println("3-)Account Details");
            System.out.println("4-)New AccountID");
            System.out.println("5-)EXIT");
            option= sc.nextInt();
            if(option==1){
                System.out.println("Please enter the amount of money that will be deposited!");
                int x= sc.nextInt();
                b1.deposit(x);
            }
            else if(option==2){
                System.out.println("Please enter the amount of money that will be withdrawed!");
                int y= sc.nextInt();
                b1.withdraw(y);
            }
            else if(option==3){
                System.out.println("Here is the account details!");
                b1.accountDetails(b1.getAccountID(), b1.getBalance() );
            }else if(option==4){
                System.out.println("Please enter your old account ID: ");//The reason why ı use this part is that big bank companies have this kind of security precaution something like this.
                int z= sc.nextInt();
                System.out.println("Please enter your new account ID: ");
                int t= sc.nextInt();
                b1.changeAccountID(t);
                System.out.println();
                System.out.println("Your new account ID:"+t);
            }
        }while(option!=5);
        System.out.println("Have a nice day!");

    }
}