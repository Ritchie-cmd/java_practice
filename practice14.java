//       *
//      **
//     *  
//    **  
//   ***  
//    **  
//     *  
//      **
//       *
public class practice14 {
    public static void main(String[] args) {
        for(int r = 1; r <= 9; r++){
            for(int c = 1; c <= 5; c++){
                if((r == 1 && c == 5) ||
                   (r == 2 && (c == 4 || c == 5)) ||
                   (r == 3 && c == 3) ||
                   (r == 4 && (c == 2 || c == 3)) ||
                   (r == 5 && (c == 1 || c == 2 || c == 3)) ||
                   (r == 6 && (c == 2 || c == 3)) ||
                   (r == 7 && c == 3) ||
                   (r == 8 && (c == 4 || c == 5)) ||
                   (r == 9 && c == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
