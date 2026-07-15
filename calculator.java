import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("       CALCULATOR         ");
        System.out.println("==========================");
        System.out.println("[ + ] [ - ] [ * ] [ / ]");
        System.out.println("==========================");

        while (true) {
            double num1 = 0;
            double num2 = 0;

            // === GET FIRST NUMBER ===
            boolean validNum1 = false;
            while (!validNum1) {
                System.out.print("FIRST NUMBER: ");
                try {
                    num1 = sc.nextDouble();
                    sc.nextLine();
                    validNum1 = true;
                } catch (Exception e) {
                    System.out.println("❌ INVALID! Please enter a number!");
                    sc.nextLine(); // clear bad input!
                }
            }

            // === GET OPERATOR ===
            System.out.print("OPERATOR ( + - * / ) or X to exit: ");
            String op = sc.nextLine().trim();

            if (op.equalsIgnoreCase("x")) {
                System.out.println("GOODBYE!");
                break;
            }

            // === GET SECOND NUMBER ===
            boolean validNum2 = false;
            while (!validNum2) {
                System.out.print("SECOND NUMBER: ");
                try {
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    validNum2 = true;
                } catch (Exception e) {
                    System.out.println("❌ INVALID! Please enter a number!");
                    sc.nextLine(); // clear bad input!
                }
            }

            // === CALCULATE ===
            System.out.println("--------------------------");
            switch (op) {
                case "+":
                    System.out.println("RESULT: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("RESULT: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("RESULT: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("❌ CANNOT DIVIDE BY ZERO!");
                    } else {
                        System.out.println("RESULT: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("❌ INVALID OPERATOR!");
            }
            System.out.println("--------------------------");
        }
    }
} 