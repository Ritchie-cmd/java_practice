public class exponent{
    public static void main(String[] args) {
        int x = 1;
        int i = 1;
        while(x <= 1000){
            x = (int) Math.pow(2, x);
            i = i + 1;
            System.out.print(x+" ");
            System.out.println(i+" ");
        }
    }
}