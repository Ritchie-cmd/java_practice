public class array{
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};
       // fruits[0] = "pineapple"; // to change the value of indexes

       //int numOfelemnt = fruits.length; // to know how many element inside the array

        //System.out.print(numOfelemnt);

        // now to print all the alement of an array we need loop

        // for(int i = 0; i < fruits.length; i++){
        //     System.out.println(fruits[i]);
        // }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}