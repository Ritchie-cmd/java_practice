//       *
//      **
//     *  
//    **  
//   ***  
//    **  
//     *  
//      **
//       *
public class practice13 {
    public static void main(String[] args) {
        for(int r = 1; r <= 9; r++){
            for(int c = 1; c <= 5; c++){
                if(r == 1 && (c== 1 || c == 2 || c == 3 || c ==4)){
                    System.out.print(" ");
                }else if(r == 2 && (c == 1 || c == 2 || c == 3)){
                    System.out.print(" ");
                }else if(r==3 && (c==1 || c == 2 || c == 4 || c ==5)){
                    System.out.print(" ");
                }else if(r == 4 && (c == 1 || c == 4 || c ==5)){
                    System.out.print(" ");
                }else if( r == 5 && (c == 4 || c == 5)){
                    System.out.print(" ");
                }else if(r == 6 && (c == 1 || c == 4 || c ==5)){
                    System.out.print(" ");
                }else if(r==7 && (c==1 || c == 2 || c == 4 || c ==5)){
                    System.out.print(" ");
                }else if(r == 8 && (c == 1 || c == 2 || c == 3)){
                    System.out.print(" ");
                }else if(r == 9 && (c== 1 || c == 2 || c == 3 || c ==4)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
