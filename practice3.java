public class practice3{
    public static void main(String[] args){

        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int mul= 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                mul = 2 * arr[i][j];
                System.out.print(mul+" ");
            }
            System.out.println();
        }
    }
}