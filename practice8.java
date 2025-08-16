public class practice8{
    public static void main(String[] args) {
        for(int r = 1; r <= 5; r++){
            for(int c = 1; c <= 5; c++){
                if( r==2 && (c==2 || c == 3|| c == 4)){
                    System.out.print(" ");
            }else if( r == 3 && (c==2 || c == 3|| c == 4)){
                System.out.print(" ");
            }else if(r == 4 && (c==2 || c == 3|| c == 4)){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
            }
            System.out.println();
        }
    }
}
//*****
//*   *
//*   *
//*   *
//*****