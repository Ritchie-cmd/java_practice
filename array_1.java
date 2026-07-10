import java.util.Scanner;
public class array_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("input a number:");
        int input1 = sc.nextInt();
        System.out.print("input a number:");
        int input2 = sc.nextInt();

        sum = input1 + input2;
        System.out.print(sum);
    }
}