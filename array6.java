// Count how many even numbers are in this array
// int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// Your task: Count and print how many even numbers there are
public class array6{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        System.out.print("the numbers of even numbers is "+count);
    }
}