//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
public class practice7{
    public static void main(String[] args) {
        for(int r = 5; r >= 1; r--){
            for(int s = r; s <= 4; s++){
                System.out.print(" ");
            }
            for(int k = r; k >= 1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}