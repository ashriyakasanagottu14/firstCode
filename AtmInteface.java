//importing scanner library 
import java.util.Scanner;
//creating account for the user
class Account{
    private double balance;
    
    public Account(double intialBalance){
        this.balance=intialBalance;
    }
    //checking balance
    public double getBalance(){
        return balance;
    }
    //depositing amount
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Your amount deposited Sucessfully!!!");
        }else{
            System.out.println("Enter a positive amount");
        }
    }
    //withdrawing amount
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawed Sucsessfulyy!!!");
        }else if (amount>balance){
            System.out.println("Insufficent balance!!");
        }else{
            System.out.println("Enter the postitive amount");
        }
    }
}

//creating a class for atm
class ATM{
    private Account account;
    private Scanner scanner;

    public ATM(Account account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    
    public void start(){
        boolean quit=false;
        
        while(!quit){
            System.out.println("\nWelcome to ATM!!!!!\n");
            System.out.println("1:Withdraw Amount");
            System.out.println("2:Deposite Amount");
            System.out.println("3:Check Balance");
            System.out.println("4:Quit");
            System.out.println("Choose an option");
            
            int option=scanner.nextInt();
            
            switch(option){
                case 1:
                    makeWithdraw();
                    break;
                case 2:
                    makeDeposit();
                    break;
                case 3:
                    getAmount();
                    break;
                case 4:
                    quit=true;
                    System.out.println("Thank you!!! \nTake your card!!");
                    break;
                default:
                    System.out.println("Invalid option!!");
                    break;
            }
        }
    }
    
    private void makeWithdraw(){
        System.out.println("Enter amount to Withdraw:");
        double amount=scanner.nextDouble();
        account.withdraw(amount);
    }
    
    private void makeDeposit(){
        System.out.println("Enter amount to Deposit:");
        double amount=scanner.nextDouble();
        account.deposit(amount);
        
    }
    
    private void getAmount(){
        System.out.println("Your current Balanec is:"+account.getBalance());
    }
}

//creating main class 
public class AtmInteface{
    public static void main(String[] args){
        Account acc=new Account(5000);
        ATM atm=new ATM(acc);
        atm.start();
    }
}