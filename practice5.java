public class practice5{
    public static void main(String[] args) {
        for(int r = 1; r <= 3; r++){
            for(int c = 1; c <= 4; c++){
                if( r == 2 && c == 2 || r == 2 && c == 3){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
//****
//*  *
//****