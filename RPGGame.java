// import java.util.Scanner;
// class Hero{
//     String HeroName;
//     int HP;
//     int attackPower;

//     Hero(String name, int hp, int attack){
//         this.HeroName = name;
//         this.HP = hp;
//         this.attackPower = attack;
//     }

//     void attack(Enemy enemy){
//         enemy.HP -= attackPower;
//         System.out.println(HeroName+" ATTACK "+enemy.EnemyName);
//         System.out.println(enemy.EnemyName+" REMAINING HP : "+enemy.HP);
//     }

//     void display(){
//         System.out.println("HERO NAME: "+HeroName);
//         System.out.println("HP: "+HP);
//         System.out.println("ATTACK POWER: ");
//     }
// }

// class Warrior extends Hero{
//     int armor;

//     Warrior(String name, int hp, int attack, int armor){
//         super(name, hp, attack);
//         this.armor = armor;
//     }

//     void attack(Enemy enemy){
//         enemy.HP -= attackPower;
//         System.out.println(HeroName+" ATTACK "+enemy.EnemyName);
//         System.out.println(enemy.EnemyName+" REMAINING HP: "+enemy.HP);
//     }

//     void defend(Enemy enemy){
//         HP += armor;
//         System.out.println(armor+" ARMOR ADDED HERO HP "+HP);
//         HP -= enemy.attackPower;
//         System.out.println(enemy.EnemyName+" ATTACK HERO "+HeroName);
//         System.out.println("HERO REMAINING HP: "+HP);
//     }
// }

// class Mage extends Hero{
//     int mana;

//     Mage(String name, int hp, int attack, int mana){
//         super(name, hp, attack);
//         this.mana = mana;
//     }

//     void attack(Enemy enemy){
//         int totalDamage = attackPower + mana; // 👈 local variable!
//         enemy.HP -= totalDamage;              // use local variable
//         System.out.println(" MANA ADDED TO HERO ATTACK POWER BECOME: "+attackPower);
//         enemy.HP -= attackPower;
//         System.out.println(HeroName+" attack "+enemy.EnemyName);
//         System.out.println(enemy.EnemyName+" REMAINING HP "+enemy.HP);
//     }

//     void display(){
//         System.out.println(HeroName);
//         System.out.println("HP: "+HP);
//         System.out.println("ATTACK POWER: "+attackPower);
//     }
// }

// class archer extends Hero{
//     int arrow;

//     archer(String name, int hp, int attack, int arrow){
//         super(name, hp, attack);
//         this.arrow = arrow;
//     }

//     void attack(Enemy enemy){
//         int totalDamage = attackPower + arrow; // 👈 local variable!
//         enemy.HP -= totalDamage;              // use local variable
//         System.out.println(arrow+"  ARROW ADDED TO HERO ATTACK POWER");
        
//         enemy.HP -= attackPower;
//         System.out.println(HeroName+" ATTACK "+enemy.EnemyName);
//         System.out.println(enemy.EnemyName+" REMAINING HP: "+enemy.HP);
//     }

//     void display(){
//         System.out.println(HeroName);
//         System.out.println("HP: "+HP);
//         System.out.println("ATTACK POWER: "+attackPower);
//     }
// }

// // ==========================================================
// class Enemy{
//     String EnemyName;
//     int HP;
//     int attackPower;

//     Enemy(String name, int hp, int attack){
//         this.EnemyName = name;
//         this.HP = hp;
//         this.attackPower = attack;
//     }

//     void attack(Hero hero){
//         hero.HP -= attackPower;
//         System.out.println(EnemyName+" ATTACK "+hero.HeroName);
//         System.out.println("HERO REMAINING HP "+hero.HP);
//     }

//     void display(){
//         System.out.println(EnemyName);
//         System.out.println("HP: "+HP);
//         System.out.println("ATTACK POWER: "+attackPower);
//     }
// }
// public class RPGGame{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("=============================================");
//         System.out.println("         WELCOME TO GAME OF SURVIVAL         ");
//         System.out.println("=============================================");

//         System.out.println("            PLEASE CHOOSE YOUR ROLE: ");
//         System.out.println("=============================================");

//         System.out.println("[1] WARRIOR ");
//         System.out.println("[2] MAGE ");
//         System.out.println("[3] ARCHER ");
//         int choose = sc.nextInt();
//         sc.nextLine();

//         Hero hero = null;

//         System.out.println("HERO NAME: ");
//         String name = sc.nextLine();

//         if(choose == 1){
//             hero = new Warrior(name, 500, 60, 50);
//         }else if(choose == 2){
//             hero = new Mage(name, 500, 50, 50);
//         }else if(choose == 3){
//             hero = new archer(name, 500, 50, 50);
//         }else{
//             System.out.println("INVALID CHOICE!");
//         }

//         Enemy enemy = new Enemy("FIRE DRAGON", 500, 75);

//         System.out.println("============================================");
//         System.out.println("         LETS THE BATTLE BEGIN              ");
//         System.out.println("============================================");

//         while(true){
//             System.out.println("======================================");
//             System.out.println(       hero.HeroName+" : HP: "+hero.HP);
//             System.out.println("                   VS                 ");
//             System.out.println(     enemy.EnemyName+" : HP: "+enemy.HP);
//             System.out.println("======================================");


//             System.out.println("[1] ATTACK");
//             System.out.println("[2] RUN");
//             int action = sc.nextInt();
//             sc.nextLine();

//             if(action == 1){
//                 hero.attack(enemy);// 👈 POLYMORPHISM HERE!
//             }else if(action == 2){
//                 System.out.println("YOU RUN AWAY!");
//                 break;
//             }

//             if(enemy.HP <= 0){
//                 System.out.println("YOU WIN!");
//                 break;
//             }

//             enemy.attack(hero);

//             if(hero.HP <= 0){
//                 System.out.println(" YOU LOSE!");
//                 break;
//             }
//         }

//     }
// }