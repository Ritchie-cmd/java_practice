// *       *
//   *   *  
//     *    
//   *    *
// *        *
public class practice12 {
    public static void main(String[] args) {
        for(int r = 1; r <= 5; r++){
            for(int c = 1; c <= 9; c++){
                if(r == 1 && (c == 2 || c == 3 || c == 4 || c == 5 || c == 6 || c == 7 || c == 8)){
                    System.out.print(" ");
                }else if( r == 2 && (c == 1 || c == 2 || c == 4 || c == 5 || c == 6 || c == 8 || c == 9)){
                    System.out.print(" ");
                }else if(r == 3 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 6|| c == 7 || c == 8 || c == 9)){
                    System.out.print(" ");
                }else if(r == 4 &&(c == 1 || c == 2|| c == 4 ||c == 5 || c == 6|| c == 7 || c == 9)){
                    System.out.print(" ");
                }else if(r == 5 && ( c == 2 || c == 3 || c == 4 ||c == 5 || c == 6|| c == 7 || c == 8)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
