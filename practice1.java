import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
        
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int square = 0;

        square = num * num;

        System.out.println("the square of "+num+" is "+square);
 
        }
    }
} 
