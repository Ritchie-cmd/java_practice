public class array3 {
    public static void main(String[] args) {
        // int[] numbers = {3, 7, 2, 9, 1, 8};        //FIND THE LARGEST NUMBER
        //  int largest = numbers[0];

        //  for(int i = 1; i < numbers.length; i++){
        //     if(numbers[i] > largest){
        //         largest = numbers[i];
        //     }
        //  }
        //  System.out.println("THE LARGEST NUMBER: "+largest); // why prinnt is outside the loop? cause if we put print inside it will prinf 
        //                                                     // all the previous large nuber 
        //                                                     // but if outside the loop it will only print the final largest number
                                    
        
        int[] numbers = {15, 22, 8, 33, 11};
        int largest = numbers[0];
        
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("THE LARGEST NUMBER : "+largest);
    }
}
