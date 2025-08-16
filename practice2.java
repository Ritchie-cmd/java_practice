public class practice2{
    public static void main(String[] args) {

            int i = 1;
        for( int r = 1; r <= 3; r++){
            for(int c = 1; c <= 3; c++){
                r = 10 + r;
                i = r + 1;
                System.out.print(r+" ");
                System.out.print(i+" ");
            }
        }
    }
}