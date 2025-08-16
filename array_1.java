import java.util.Scanner;
public class array_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] cars = new String[5];

        
        
        for(int i = 0; i < cars.length; i++){
            System.out.print(""+( i + 1)+":CARS: ");
            cars[i] = sc.nextLine();
        }       
    }
}