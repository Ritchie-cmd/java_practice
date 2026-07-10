// Write a function that counts how many times a specific number appears in an array.
import java.util.Scanner;
public class array4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {4, 3, 4, 1, 4, 4,6,8,5,8,2,4};
        int count = 0;
        System.out.print("enter the target number: ");
        int n = sc.nextInt();

        for(int i = 0; i < num.length; i++){
            if(num[i] == n){
                count++;
            }
        }
        System.out.println("the number: "+n+" is occured "+count+" times");
    }
}