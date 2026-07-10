import java.util.Scanner;
public class atm_projects {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String name = " ";
        int pin = 0;
        double balance = 0;
        double amount = 0;

        while(true){
        System.out.println("=================================");
        System.out.println("         WELCOME TO ATM         ");
        System.out.println("=================================");
        System.out.println("[1] Create an Account ");
        System.out.println("[2] Log in ");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if( choice == 1){
            System.out.print("Enter Your Name: ");
            name = sc.nextLine();

            System.out.print("Create a Pin: ");
            pin = sc.nextInt();
            System.out.println("Account Created Successfully! Welcome, "+name);
            System.out.println("Please Log in to Access Your Account ");

//============================================================================
        }else if(choice == 2){
            System.out.print("Please Enter your Name: ");
            String name1 = sc.nextLine();

            System.out.print("Enter Pin: ");
            int pin2 = sc.nextInt();
            sc.nextLine();

            if(pin == pin2 && name1 .equals(name)){
                System.out.println("Log in Successfully: Welcome "+name);
//==========================================================================================
                while(true){
                    System.out.println("[1] Check Balance");
                    System.out.println("[2] Deposit");
                    System.out.println("[3] Withdraw");
                    System.out.println("[4] Exit");

                    System.out.println("Choice: ");
                    int choice2 = sc.nextInt();
                    sc.nextLine();

                    if(choice2 == 1){
                        System.out.printf("Current balance: ₱%.2f ",balance);
                        sc.nextLine();
                    }else if(choice2 == 2){
                        System.out.println("How much are you going to Deposit? ₱ ");
                        amount = sc.nextDouble();

                        if(amount <= 0){
                            System.out.print("Invalid Amount");
                        }else{
                            balance += amount;
                            System.out.println("Balance:₱ "+balance);
                        }
                    }else if(choice2 == 3){
                        System.out.println("How much are you going to Withdraw? ₱ ");
                        amount = sc.nextDouble();

                        if(amount <= 0 ){
                            System.out.println("Invalid Amount! ");
                        }else if(amount > balance){
                            System.out.println("Insufficient funds! ");
                        }else{
                            balance -= amount;
                            System.out.println("Current Balance:₱ "+balance);
                        }
                    }else if(choice2 == 4){
                        System.out.println("GoodBye! ");
                        break;
                    }
                }
            }else{
                System.out.println("Log in Failed! ");
            }
        }else{
            System.out.print("Please Enter the Correct Choice");
        }

    }
}
}