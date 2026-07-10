// Find the index (position) of a specific number
// int[] data = {7, 3, 9, 1, 5, 8, 2};
// int target = 5;
// Your task: Find what index position the number 5 is at

public class array8{
    public static void main(String[] args) {
        int[] array = {7, 3, 9, 1, 5, 8, 2};
        int target = 1;
        for(int i = 0; i < array.length; i++){
            if(target == array[i]){
                System.out.print("found the "+target+" at "+array[i]);
            }
        }
        
    }
}