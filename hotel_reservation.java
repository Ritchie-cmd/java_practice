import java.util.Scanner;
import java.util.ArrayList;
class Guest{
    String name;
    int age;
    String address;
    int RoomReserve;

    Guest(String GuestName, int GuestAge, String GuestAddress){
        this.name = GuestName;
        this.age = GuestAge;
        this.address = GuestAddress;
    }

    void display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("ADDRESS: "+address);
    }
}

class Room{
    int roomNumber;
    int roomPrice;
    boolean Occupied = false;

    Room(int roomNumber, int roomPrice, boolean Occupied){
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.Occupied = Occupied;
    }

    void display(){
        System.out.println("ROOM NUMBER [ "+roomNumber+" ] ROOM PRICE [ "+roomPrice+" ] : "+Occupied);
    }
}

class StandardRoom extends Room{
    String bedType;

    StandardRoom(int roomNumber, int roomPrice, boolean Occupied, String bedType){
        super(roomNumber, roomPrice, Occupied);
        this.bedType = bedType;
    }

    void display(){
        super.display();
        System.out.println("BEDTYPE: "+bedType);
    }
}

class DeluxeRoom extends Room{
    String view;

    DeluxeRoom(int roomNumber, int roomPrice, boolean Occupied, String view){
        super(roomNumber, roomPrice, Occupied);
        this.view = view;
    }

    void display(){
        super.display();
        System.out.println("VIEW: "+view);
    }
}
public class hotel_reservation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Guest> guests = new ArrayList<>();
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new StandardRoom(101,500, false, "single bed"));
        rooms.add(new StandardRoom(102, 500, false, "DOUBLE"));
        rooms.add(new DeluxeRoom(103, 0600, false, "Ocean"));
        rooms.add(new DeluxeRoom(104, 5000, false, "Oceqan"));

        System.out.println("====================================================");
        System.out.println("        WELCOME TO OUR HOTEL DE LUNA                ");
        System.out.println("====================================================");

        while(true){
            System.out.println("[1] ADD GUEST");
            System.out.println("[2] VIEW GUEST LIST");
            System.out.println("[3] RESERVE");
            System.out.println("[4] CHECKOUT");
            System.out.println("[5] EXIT");
            int choose = sc.nextInt();
            sc.nextLine();

            if(choose == 1){
                System.out.println("NAME: ");
                String name = sc.nextLine();
                System.out.println("AGE: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("ADDRESS: ");
                String address = sc.nextLine();

                guests.add(new Guest(name, age, address));
            }else if(choose == 2){
                if(guests.isEmpty()){
                    System.out.println("NO GUEST YET!");
                }else{
                    for(int i = 0; i < guests.size(); i++){
                        guests.get(i).display();
                        System.out.println("===================");
                    }
                }
            }else if(choose == 3){
                System.out.println("PLEASE ENTER YOUR NAME: ");
                String search = sc.nextLine();

                boolean found = false;
                for(int i = 0; i < guests.size(); i++){
                    if(guests.get(i).name.equals(search)){
                        found = true;
                        System.out.println(" STANDARD ROOM: [ 101 ] [ 102 ]");
                        System.out.println("DELUXE ROOM     [ 103 ] [ 104 ]");
                        int roomN = sc.nextInt();
                        sc.nextLine();

                        boolean roomFound = false;

                        for(int k = 0; k < rooms.size(); k++){
                            if(rooms.get(k).roomNumber == roomN){
                                roomFound = true;
                                if(!rooms.get(k).Occupied){
                                    rooms.get(k).Occupied = true;
                                    guests.get(i).RoomReserve = roomN;
                                    System.out.println("ROOM "+roomN+" HAS BEEN RESERVE");
                                }else{
                                    System.out.println("ROOM HAS ALREADY TAKEN");
                                }
                            }
                        }
                        if(!roomFound){
                            System.out.println("THE ROOM DID NOT EXIST");
                        }
                    }
                }
                if(!found){
                    System.out.println("NO NAME FOUND!");
                }
            }else if(choose == 4){
                System.out.println("PLEASE ENTER THE ROOM YOU RESERVE: ");
                int roomN = sc.nextInt();
                sc.nextLine();

                boolean roomFound = false;
                Room targerRoom = null;

                for(int i = 0; i < rooms.size(); i++){
                    if(rooms.get(i).roomNumber == roomN){
                        roomFound = true;
                        targerRoom = rooms.get(i);
                    }
                }
                if(!roomFound){
                    System.out.println("ROOM NOT FOUND");
                }else if(!targerRoom.Occupied){
                    System.out.println("ROOMS IS NOT OCCUPIED");
                }else{
                    System.out.println(" PLEASE ENETR THE GEUST NAME: ");
                    String name = sc.nextLine();

                    boolean guestFound = false;
                    for(int i = 0; i < guests.size(); i++){
                        if(guests.get(i).name.equals(name) && guests.get(i).RoomReserve == roomN){
                            guestFound = true;
                            guests.get(i).RoomReserve = 0;
                            targerRoom.Occupied = false;
                            System.out.println("===========================");
                            System.out.println("        CHECK OUT          ");
                            System.out.println("===========================");
                            break;
                        }
                    }
                    if(!guestFound){
                        System.out.println("Guest did not reserve this room");
                    }
                }
            }else if(choose == 5){
                System.out.println("THANK YOU FOR CHOOSING THIS HOTEL!");
                break;
            }
        }
    }
}


// import java.util.Scanner;
// import java.util.ArrayList;

// class BankAccount {
//     private int AccountNumber;
//     private String ownerName;
//     private int balance;
//     private int pin;

//     BankAccount(int AccountNumber, String ownerName, int balance, int pin) {
//         this.AccountNumber = AccountNumber;
//         this.ownerName = ownerName;
//         this.balance = balance;
//         this.pin = pin;
//     }

//     // getter
//     public int getAccountNumber() {
//         return AccountNumber;
//     }

//     // setter
//     public void setAccountNumber(int number) {
//         AccountNumber = number;
//     }

//     // getter
//     public String getOwnerName() {
//         return ownerName;
//     }

//     // setter
//     public void setOwnerName(String name) {
//         ownerName = name;
//     }

//     // getter
//     public int getBalance() {
//         return balance;
//     }

//     // setter
//     public void setBalance(int amount) {
//         if (amount < 0) {
//             System.out.println("INVALID AMOUNT");
//         } else {
//             balance = amount; // ✅ sets not adds!
//         }
//     }

//     // getter
//     public int getPin() {
//         return pin;
//     }

//     // setter
//     public void setPin(int pin) {
//         this.pin = pin;
//     }

//     void deposit(int deposit) {
//         if (deposit <= 0) {
//             System.out.println("INVALID AMOUNT");
//         } else {
//             balance += deposit;
//             System.out.println("YOU DEPOSIT " + deposit);
//         }
//     }

//     void withdraw(int amount) {
//         if (amount <= 0) {
//             System.out.println("INVALID AMOUNT");
//         } else if (amount > balance) {
//             System.out.println("INSUFFICIENT FUNDS");
//         } else {
//             balance -= amount;
//             System.out.println("YOU WITHDRAW " + amount);
//         }
//     }

//     void display() {
//         System.out.println("- " + ownerName);
//         System.out.println("- " + AccountNumber);
//         System.out.println("- " + balance);
//     }

//     boolean checkPin(int checkpin) {
//         return checkpin == pin;
//     }
// }

// class SavingAccount extends BankAccount {
//     private int interest;

//     SavingAccount(int accNum, String name, int balance, int pin, int interest) {
//         super(accNum, name, balance, pin);
//         this.interest = interest;
//     }

//     void addInterest() {
//         int currentBalance = getBalance();
//         currentBalance = currentBalance + (currentBalance * interest);
//         setBalance(currentBalance);
//         System.out.println("INTEREST ADDED TO BALANCE: " + getBalance());
//     }

//     void display() {
//         super.display();
//         System.out.println("Interest " + interest);
//     }
// }

// class CurrentAccount extends BankAccount {
//     private int overDraftLimit;

//     CurrentAccount(int accNum, String name, int balance, int pin, int overD) {
//         super(accNum, name, balance, pin);
//         this.overDraftLimit = overD;
//     }

//     void withdraw(int amount) {
//         int currentBalance = getBalance();
//         if (amount > currentBalance + overDraftLimit) {
//             System.out.println("EXCEED OVER LIMIT");
//         } else {
//             currentBalance -= amount; // ✅ subtract the amount!
//             setBalance(currentBalance); // ✅ use setBalance not setAccountNumber!
//             System.out.println("WITHDRAW SUCCESSFUL");
//         }
//     }
//     void display(){
//     super.display();
//     System.out.println("Overdraft Limit: "+overDraftLimit);
// }
// }

// public class bankAccounts {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<BankAccount> accounts = new ArrayList<>();

//         System.out.println("=================================");
//         System.out.println("         WELCOME TO MYBANK       ");
//         System.out.println("=================================");

//         while(true){
//             System.out.println("[1] CREATE ACCOUNT");
//             System.out.println("[2] VIEW ALL ACCOUNT");
//             System.out.println("[3] DEPOSIT");
//             System.out.println("[4] WITHDRAW");
//             System.out.println("[5] TRANSFER");
//             System.out.println("[6] EXIT");
//             int choose = sc.nextInt();
//             sc.nextLine();

//             if(choose == 1){
//                 System.out.println("ACCOUNT NUMBER: ");
//                 int accNum = sc.nextInt();
//                 sc.nextLine();
//                 System.out.println("OWNER NAME: ");
//                 String name = sc.nextLine();
//                 System.out.println("Balance ");
//                 int balance = sc.nextInt();
//                 sc.nextLine();
//                 System.out.println("CREATE PIN: ");
//                 int pin = sc.nextInt();
//                 sc.nextLine();

//                 System.out.println("[1] SAVINGS [2] CURRENT");
//                 int c = sc.nextInt();
//                 sc.nextLine();

//                 if( c == 1){
//                     System.out.println("INTEREST: ");
//                     int interest = sc.nextInt();
//                     sc.nextLine();

//                     accounts.add(new SavingAccount(accNum, name, balance, pin, interest));
//                 }else if( c == 2){
//                     System.out.println("OVER DRAFT LIMIT FOR THIS ACCOUNT: ");
//                     int limit = sc.nextInt();
//                     sc.nextLine();

//                     accounts.add(new CurrentAccount(accNum, name, balance, pin, limit));
//                 }else{
//                     System.out.println("INVALID CHOICE  ");
//                 }
//             }else if(choose == 2){
//                     if(accounts.isEmpty()){
//                         System.out.println("SORRY NO ACCOUNT YET");
//                     }else{
//                         for(int i = 0; i < accounts.size(); i++){
//                             accounts.get(i).display();
//                             System.out.println("===================");
//                         }
//                     }
//             }else if(choose == 3){
//                 System.out.println("ENTER YOUR ACCOUNT NUMBER: ");
//                 int accNum = sc.nextInt();
//                 sc.nextLine();

//                 boolean found = false;
//                 for(int i  = 0; i < accounts.size(); i++){
//                     if(accounts.get(i).getAccountNumber() == accNum){
//                         found = true;

//                         System.out.println("ENTER YOUR PIN:     ");
//                         int pin = sc.nextInt();
//                         sc.nextLine();

//                         if(accounts.get(i).checkPin(pin)){
//                             System.out.println("PLEASE ENTER THE AMOUNT YOU WANT TO DEPOSIT: ");
//                             int deposit = sc.nextInt();
//                             sc.nextLine();
//                             accounts.get(i).deposit(deposit);
//                         }else{
//                             System.out.println("WRONG PIN:");
//                         }
//                     }
//                 }
//                 if(!found){
//                     System.out.println("ACCOUNT NOT FOUND ");
//                 }
//             }else if(choose == 4){
//                 System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER: ");
//                 int accNUm = sc.nextInt();
//                 sc.nextLine();

//                 boolean found = false;
//                 for(int i = 0; i < accounts.size(); i++){
//                     if(accounts.get(i).getAccountNumber() == accNUm){
//                         found = true;

//                         System.out.println("PLEASE ENTER YOUR PIN: ");
//                         int pin = sc.nextInt();
//                         sc.nextLine();

//                         if(accounts.get(i).checkPin(pin)){
//                             System.out.println("PLEASE ENTER THE AMOUNT YOU WANT TO WITHDRAW: ");
//                             int withdraw = sc.nextInt();
//                             sc.nextLine();

//                             accounts.get(i).withdraw(withdraw);
//                         }else{
//                             System.out.println("WRONG PIN");
//                         }
//                     }
//                 }
//                 if(!found){
//                     System.out.println("ACCOUNT NOT FOUND");
//                 }
//             }else if(choose == 5){
//                 System.out.println("ENTER YOUR ACCOUNT NUMBER: ");
//                 int accNum = sc.nextInt();
//                 sc.nextLine();

//                 boolean found = false;
//                 for(int i = 0; i < accounts.size(); i++){
//                     if(accounts.get(i).getAccountNumber() == accNum){
//                         found = true;

//                         System.out.println("PLEASE ENTER YOUR PIN: ");
//                         int pin = sc.nextInt();
//                         sc.nextLine();

//                         if(accounts.get(i).checkPin(pin)){
//                             System.out.println(" PLEASE ENTER THE ACCOUNT NUMBER YOU WANT TO RECEIVE: ");
//                             int receive = sc.nextInt();
//                             sc.nextLine();

//                             boolean accFound = false;
//                             for(int k = 0; k < accounts.size(); k++){
//                                 if(accounts.get(k).getAccountNumber() == receive){
//                                     accFound = true;

//                                     System.out.println("ENTER THE AMOUNT YOU WANT TO SEND: ");
//                                     int money = sc.nextInt();
//                                     sc.nextLine();

//                                     if(accNum == receive){
//                                         System.out.println("INVALID REQUEST");
//                                     }else{
//                                         accounts.get(i).withdraw(money);
//                                         accounts.get(k).deposit(money);
//                                     }
//                                 }
//                             }
//                             if(!accFound){
//                                 System.out.println("RECEIVER ACCOUNT NOT FOUND");
//                             }
//                         }else{
//                             System.out.println("WRONG PIN");
//                         }
//                     }
//                 }
//                 if(!found){
//                     System.out.println("account not found");
//                 }
//             }else if(choose == 6){
//                 System.out.println("THANK YOU FOR TRUSTING US");
//                 break;
//             }
//         }
//     }
// }










///////////////////////////////////// GAMEEEE            =====================================================
/// import java.util.Scanner;
class Hero{
    String HeroName;
    int HP;
    int attackPower;

    Hero(String name, int hp, int attack){
        this.HeroName = name;
        this.HP = hp;
        this.attackPower = attack;
    }

    void attack(Enemy enemy){
        enemy.HP -= attackPower;
        System.out.println(HeroName+" attack "+enemy.EnemyName);
    }

    void display(){
        System.out.println(HeroName+" ");
        System.out.println(HP+" ");
        System.out.println(attackPower+" ");
    }
}

class Warrior extends Hero{
    int armor;

    Warrior(String name, int hp, int attack, int armor){
        super(name, hp, attack);
        this.armor = armor;
    }

    void attack(Enemy enemy){
        enemy.HP -= attackPower;
        System.out.println(HeroName+" attack "+enemy.EnemyName+": remaining hp "+enemy.HP);
    }

    void defend(Enemy enemy){
        HP += armor;
        HP -= enemy.attackPower;
        
    }

    void display(){
        super.display();
        System.out.println("+"+armor+" HP OF ARMOR");
    }
}

class Mage extends Hero{
    int mana;

    Mage(String name, int hp, int attack, int mana){
        super(name, hp, attack);
        this.mana = mana;
    }

    void attack(Enemy enemy){
        attackPower += mana;
        enemy.HP -= attackPower;

        System.out.println(HeroName+" attack "+enemy.EnemyName);
        System.out.println(enemy.EnemyName+" remaining HP "+enemy.HP);
    }

    void display(){
        super.display();
        System.out.println("MANA :"+mana+" add to attack power");
    }
}

class archer extends Hero{
    int arrow;
    
    archer(String name, int hp, int attack, int arrow){
        super(name, hp, attack);
        this.arrow = arrow;
    }

    void attack(Enemy enemy){
        attackPower += arrow;
        enemy.HP -= attackPower;
        System.out.println(HeroName+" attack "+enemy.EnemyName);
        System.out.println(enemy.EnemyName+" remaining HP"+enemy.HP);
    }

    void display(){
        super.display();
        System.out.println(arrow+" arrow add damage to attack power");
    }
}

class Enemy{
    String EnemyName;
    int HP;
    int attackPower;

    Enemy(String name, int hp, int attack){
        this.EnemyName = name;
        this.HP = hp;
        this.attackPower = attack;
    }

    void attack(Hero hero){
        hero.HP -= attackPower;
        System.out.println(EnemyName+" attack "+hero.HeroName);
    }

    void display(){
        System.out.println(EnemyName+" ");
        System.out.println(HP+" ");
        System.out.println(attackPower+" ");
    }
}
// public class RPGGame{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("===================================================");
//         System.out.println("             WELCOME TO THE ARENA                  ");
//         System.out.println("===================================================");

//         System.out.println("====================================================");
//         System.out.println("                  CHOOSE YOUR ROLE                  ");
//         System.out.println("====================================================");

//         Hero hero = null;

//         System.out.println("[1] WARRIOR ");
//         System.out.println("[2] MAGE ");
//         System.out.println("[3] ARCHER ");
//         int choose = sc.nextInt();
//         sc.nextLine();

//         System.out.println("ENTER YOUR NAME: ");
//         String name = sc.nextLine();

//         if( choose == 1){
//             hero = new Warrior(name, 500, 50, 50);
//         }else if(choose == 2){
//             hero = new Mage(name, 500, 50, 50);
//         }else if(choose == 3){
//             hero = new archer(name, 500, 50, 50);
//         }

//         Enemy enemy = new Enemy("FIRE DRAGON", 500, 50);

//         while(true){
//             System.out.println("========================================");
//             System.out.println(hero.HeroName+"  HP: "+hero.HP);
//             System.out.println("              VS                        ");
//             System.out.println(enemy.EnemyName+" HP "+enemy.HP);
//             System.out.println("========================================");

//             System.out.println("[1] ATTACK ");
//             System.out.println("[2] RUN ");
//             int action = sc.nextInt();
//             sc.nextLine();

//             if(action == 1){
//                 hero.attack(enemy); // 👈 POLYMORPHISM HERE!
//             }else{
//                 System.out.println("RUN AWAY");
//                 break;
//             }

//             if(enemy.HP <= 0){
//                 System.out.println("YOU WIN!");
//                 break;
//             }

//             enemy.attack(hero);

//             if(hero.HP <= 0){
//                 System.out.println("YOU LOSE!");
//                 break;
//             }
//         }
//     }
// }