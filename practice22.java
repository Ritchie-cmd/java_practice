//     ***  ***   
//   ***** *****  
// *************** 
//  *************
//   *********** 
//    ********* 
//     ******* 
//      ***** 
//       *** 
//        *
public class practice22{
    public static void main(String[] args) {
        for(int r = 1; r <= 2; r++){
            for(int c = 1; c <= 15; c++){
                if(r == 1 &&(c == 1 || c == 2 || c == 3 || c == 4 || c == 8 || c == 9 || c == 13 || c == 14 || c == 15)){
                    System.out.print(" ");
                }else if(r == 2 && (c == 1 || c == 2 || c == 8 || c == 14 || c == 15)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int r = 8; r >= 1; r--){
            for(int c = r; c <= 8; c++){
                System.out.print(" ");
            }
            for(int k = 1; k <= r*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}