public class practice6 {
    public static void main(String[] args) {
        for(int r = 1; r <= 3; r++){
            for(int s = 1; s <= 3 - r; s++){
                System.out.print(" ");
            }
            for(int k = 1; k <= r * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//  *
// ***
//*****