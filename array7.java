// Calculate the total sum of all elements
// int[] values = {10, 20, 30, 40, 50};
// Your task: Add all numbers and print the sum

public class array7{
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = array[i] + sum;

        }
        System.out.print("the sum of all numbers is "+sum);
    }
}