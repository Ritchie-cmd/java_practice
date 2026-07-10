import java.util.Scanner;
import java.util.ArrayList;
class BankAccount{
    private int accountNumber;
    private String ownerName;
    private int balance;
    private int pin;

    BankAccount(int accNum, String name, int balance, int pin){
        this.accountNumber = accNum;
        this.ownerName = name;
        this.balance = balance;
        this.pin = pin;
    }

    // getter & setter ==========
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accNum){
        this.accountNumber = accNum;
    }

    // getter & setter ===============
    public String getOwnerName(){
        return ownerName;
    }

    public void setName(String name){
        this.ownerName = name;
    }
    
    // getter & setter ===============
    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount){
        if(amount < 0){
            System.out.println("INVALID AMOUNT");
        }else{
            this.balance = amount;
        }
    }

    void deposit(int amount){
        if(amount <= 0){
            System.out.println("INVALID AMOUNT");
        }else{
            balance += amount;
            System.out.println(balance);
        }
    }

    void withdraw(int amount){
        if(amount <= 0){
            System.out.println("INVALID AMOUNT!");
        }else if(amount > balance){
            System.out.println("ISSUFFICEINT FUNDS");
        }else{
            balance -= amount;
        }
    }

    void display(){
        System.out.println("ACCOUNT NUMBER: "+accountNumber);
        System.out.println("NAME "+ownerName);
        System.out.println("BALANCE: "+balance);
    }

    boolean checkPin(int pin){
        return this.pin == pin;
    }
}
class AccountSavings extends BankAccount{
    private int interest;

    AccountSavings(int accNum, String name, int balance, int pin, int interest){
        super(accNum, name, balance, pin);
        this.interest = interest;
    }

    void addInterest(){
        int currentBalance = getBalance();
        currentBalance = currentBalance + (currentBalance * interest);
        setBalance(currentBalance);
        System.out.println(": "+interest+" ADDED TO BALANCE "+getBalance());
    }

    void display(){
        super.display();
        System.out.println("INTEREST: "+interest);
    }
}

class currentAccount extends BankAccount{
    private int overDraftLimit;

    currentAccount(int accNum, String name, int balance, int pin, int over){
        super(accNum, name, balance, pin);
        this.overDraftLimit = over;
    }

    void withdraw(int amount){
        int currentBalance = getBalance();
        if(amount > currentBalance + overDraftLimit){
            System.out.println("OVERD LIMIT");
        }else{
            currentBalance -= amount;
            setBalance(currentBalance);
            System.out.println("WITHDRAW SUCCESSFULLY");
        }
    }

    void display(){
        super.display();
        System.out.println("OVER LIMIT: "+overDraftLimit);
    }
}
public class bankAccounts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        System.out.println("=================================================");
        System.out.println("             WELCOME TO MYBANK APP               ");
        System.out.println("=================================================");

        while(true){
            System.out.println("[1] CREATE ACCOUNT");
            System.out.println("[2] VIEW ALL ACCOUNTS");
            System.out.println("[3] DEPOSIT");
            System.out.println("[4] WITHDRAW");
            System.out.println("[5] TRANSFER");
            System.out.println("[6] EXIT");
            int choose = sc.nextInt();
            sc.nextLine();

            if(choose == 1){
                System.out.println("ACCOUNT NUMBER: ");
                int accNum = sc.nextInt();
                sc.nextLine();
                System.out.println("NAME: ");
                String name = sc.nextLine();
                System.out.println("BALANCE: ");
                int balance = sc.nextInt();
                sc.nextLine();
                System.out.println("PIN: ");
                int pin = sc.nextInt();
                sc.nextLine();

                System.out.println("[1] ACCOUNT SAVINGS [2] CURRENT ACCOUNT");
                int type = sc.nextInt();
                sc.nextLine();

                if(type == 1){
                    System.out.println("INTEREST: ");
                    int interest = sc.nextInt();
                    sc.nextLine();

                    accounts.add(new AccountSavings(accNum, name, balance, pin, interest));
                }else if(type == 2){
                    System.out.println("OVER DRAFT LIMIT: ");
                    int limit = sc.nextInt();
                    sc.nextLine();

                    accounts.add(new currentAccount(accNum, name, balance, pin, limit));
                }
            }else if(choose == 2){
                if(accounts.isEmpty()){
                    System.out.println("NO ACCOUNTS YET!");
                }else{
                    for(int i = 0; i < accounts.size(); i++){
                    accounts.get(i).display();
                    System.out.println("==============================");
                }
                }
            }else if(choose == 3){
                System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER: ");
                int accNum = sc.nextInt();
                sc.nextLine();

                boolean found = false;
                for(int i = 0; i < accounts.size(); i++){
                    if(accounts.get(i).getAccountNumber() == accNum){
                        found = true;

                        System.out.println("ENTER YOUR PIN: ");
                        int pin = sc.nextInt();
                        sc.nextLine();

                            if(accounts.get(i).checkPin(pin)){

                                System.out.println("PLEASE ENTER THE AMOUNT: ");
                                int deposit = sc.nextInt();
                                sc.nextLine();

                                accounts.get(i).deposit(deposit);
                            }else{
                                System.out.println("WRONG PIN");
                            }
                    }
                }
                if(!found){
                    System.out.println("ACCOUNT NOT FOUND");
                }
            }else if(choose == 4){
                System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER: ");
                int accNum = sc.nextInt();
                sc.nextLine();

                boolean found = false;
                for(int i = 0; i < accounts.size(); i++){
                    if(accounts.get(i).getAccountNumber() == accNum){
                        found = true;

                        System.out.println("ENTER YOUR PIN: ");
                        int pin = sc.nextInt();
                        sc.nextLine();

                        if(accounts.get(i).checkPin(pin)){
                            System.out.println("PLEASE ENTER THE AMOUNT: ");
                            int withdraw = sc.nextInt();
                            sc.nextLine();

                            accounts.get(i).withdraw(withdraw);
                        }else{
                            System.out.println("WRONG PIN");
                        }
                    }
                }
                if(!found){
                    System.out.println("NO ACCOUNT FOUND!");
                }
            }else if(choose == 5){
                System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER: ");
                int accNum = sc.nextInt();
                sc.nextLine();

                boolean found = false;
                for(int i = 0; i < accounts.size(); i++){
                    if(accounts.get(i).getAccountNumber() == accNum){
                        found = true;

                        System.out.println("ENTER YOUR PIN: ");
                        int pin = sc.nextInt();
                        sc.nextLine();

                        if(accounts.get(i).checkPin(pin)){
                            System.out.println("ENTER THE ACCOUNT NUMBER YOU WANT TO RECEIVE: ");
                            int acc = sc.nextInt();
                            sc.nextLine();

                            boolean accfound = false;
                            for(int k = 0; k < accounts.size(); k++){
                                if(accounts.get(k).getAccountNumber() == acc){
                                    accfound = true;

                                    System.out.println("ENTER THE AMOUNT: ");
                                    int money = sc.nextInt();
                                    sc.nextLine();
                                    //=====================================================================================
                                    if(accNum == acc){
                                        System.out.println("INVALID REQUEST");
                                    }else{
                                        accounts.get(i).withdraw(money);
                                        accounts.get(k).deposit(money);
                                    }
                                    //==========================================================================================
                                }
                            }
                            if(!accfound){
                                System.out.println("ACCOUNT NOT FOUND");
                            }
                        }else{
                            System.out.println("WRONG PIN!");
                        }
                    }
                }
                if(!found){
                    System.out.println("ACCOUNT NOT FOUND");
                }
            }else if(choose == 6){
                System.out.println("THANK YOU FOR USING OUR MYBANK APP");
                break;
            }
        }
    }
}

//can you sent back all the message for my next projext anything about polymorphism and also im not faster i got lazy and only done it after to days does claude dont know what time i stop and comeback?