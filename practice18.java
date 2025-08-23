//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
public class practice18{
    public static void main(String[] args) {
        for(int r = 1; r <= 5; r++){
            for(int c = r; c <= 4; c++){
                System.out.print(" ");
            }
            for(int k = 1; k <= r*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r = 4; r >= 1; r--){
            for(int c = r; c <= 4; c++){
                System.out.print(" ");
            }
            for(int k = 1; k <= r*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}