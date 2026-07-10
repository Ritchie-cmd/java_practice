import java.util.Scanner;
abstract class Hero{
    String name;
    int hp;
    int attackPower;

    Hero(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attackPower = attack;
    }

    abstract void attack(Enemy enemy);
    abstract void display();
}

class Warrior extends Hero{
    int armor;

    Warrior(String name, int hp, int attack, int armor){
        super(name, hp, attack);
        this.armor = armor;
    }

    @Override
    void attack(Enemy enemy){
        enemy.hp -= attackPower;
        System.out.println(name+" ATTACK "+enemy.name);
        System.out.println(enemy.name+" REMAINING HP: "+enemy.hp);
    }

    void defend(Enemy enemy){
        System.out.println(armor+" ARMOR ATTRIBUTE ADDED IN HERO HP: "+hp);
        int total = hp + armor;
        System.out.println("HERO CURRENT HP: "+total);
        System.out.println("-------------------------");
        System.out.println(enemy.name+" ATTACK HERO "+name);
        total -= enemy.attackPower;
        System.out.println("HERO REMAINIG HP: "+total);
    }

    @Override
    void display(){
        System.out.println(name);
        System.out.println("HP: "+hp);
        System.out.println("ATTACK POWER: "+attackPower);
    }
}

class Mage extends Hero{
    int mana;

    Mage(String name, int hp, int attack, int mana){
        super(name, hp, attack);
        this.mana = mana;
    }

    @Override
    void attack(Enemy enemy){
        System.out.println(mana+" MANA ATTRIBUTES ADDED TO MAGE ATTACK: "+attackPower);
        int total = attackPower + mana;
        System.out.println("MAGE CURRENT ATTACK POWER: "+total);
        System.out.println("---------------------------------------");
        enemy.hp -= total;
        System.out.println("MAGE "+name+" ATTACK ENEMY "+enemy.name);
        System.out.println("ENEMY CURRENT HP: "+enemy.hp);
    }

    @Override
    void display(){
        System.out.println(name);
        System.out.println("HP: "+hp);
        System.out.println("ATTACK POWER: "+attackPower);
    }
}

class Archer extends Hero{
    int arrow;

    Archer(String name, int hp, int attack, int arrow){
        super(name, hp, attack);
        this.arrow = arrow;
    }

    @Override
    void attack(Enemy enemy){
        System.out.println(arrow+" ARROW ATTRIBUTE ADDED TO HERO ATTACK POWER: "+attackPower);
        int total = attackPower + arrow;
        System.out.println("HERO CURRENT ATTACK POWER: "+total);
        System.out.println("-----------------------------------------");
        enemy.hp -= total;
        System.out.println(name+" ATTACK "+enemy.name);
        System.out.println("ENEMY "+enemy.name+" CURRENT HP: "+enemy.hp);
    }

    @Override
    void display(){
        System.out.println(name);
        System.out.println("HP: "+hp);
        System.out.println("ATTACK POWER: "+attackPower);
    }
}


//======================================================
class Enemy{
    String name;
    int hp;
    int attackPower;

    Enemy(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attackPower = attack;
    }

    void attack(Hero hero){
        hero.hp -= attackPower;
        System.out.println(name+" ATTACK HERO "+hero.name);
        System.out.println("HERO REMAINING HP: "+hero.hp);
    }

    void display(){
        System.out.println(name);
        System.out.println("HP: "+hp);
        System.out.println("ATTACK POWER: "+attackPower);
    }
}
public class RPGSecond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("           WELCOME TO GAME OF THRONE         ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("[1] WARRIOR ");
        System.out.println("[2] MAGE ");
        System.out.println("[3] ARCHER ");
        System.out.println("PLEASE SELECT A ROLE FOR THE GAME TO START!");
        int select = sc.nextInt();
        sc.nextLine();

        Hero hero = null;

        System.out.println("ENTER YOUR HERO NAME: ");
        String Heroname = sc.nextLine();

        if(select == 1){
            hero = new Warrior(Heroname, 500, 50, 50);
        }else if(select == 2){
            hero = new Mage(Heroname, 500, 50, 50);
        }else if(select == 3){
            hero = new Archer(Heroname, 500, 50 ,50);
        }

        Enemy enemy = new Enemy("ICE DRAGON", 500, 55);

        System.out.println("==============================================");
        System.out.println("          LETS THE BATTLE BEGIN               ");
        System.out.println("==============================================");

        while(true){

            System.out.println("==========================================");
            System.out.println(        hero.name+"   HP: "+hero.hp);
            System.out.println("                    VS                    ");
            System.out.println(          enemy.name+"  HP: "+enemy.hp );
            System.out.println("==========================================");

            System.out.println("[1] ATTACK ");
            System.out.println("[2] RUN ");
            int action = sc.nextInt();
            sc.nextLine();

            if(action == 1){
                hero.attack(enemy);
            }else if(action == 2){
                System.out.println("YOU RUN AWAY");
                break;
            }

            if(enemy.hp <= 0){
                System.out.println("YOU WIN!");
                break;
            }

            enemy.attack(hero);

            if(hero.hp <= 0){
                System.out.println("YOU LOSE!");
                break;
            }
        }
    }
}