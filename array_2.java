import java.util.Scanner;
public class array_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for(int i = 0; i < numbers.length; i++){
            System.out.print(" "+numbers[i]);
        }
    }
} 