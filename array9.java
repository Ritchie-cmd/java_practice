public class array9{
    public static void main(String[]args){

        int[] array = {3,4,1,5,6,10,9,18,19};
        int largest = 0;
        int lrg =0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
                if(largest % 2 == 0){
                   
                }
            }
            if(array[i] % 2 != 0){
                if(array[i] > lrg){
                    lrg = array[i];
                }
            }
        }
        System.out.print("the largest even number is "+largest+" and the largest odd number is "+lrg);
    }
}

// print largest even number and the largest odd num

