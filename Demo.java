public class Demo {
    public static void mergeSort(int[] arr) {
        if (arr == null) {
            return;  // Exit early - nothing to sort
        }


        if (arr.length < 2) {
            return;  // Exit early - already sorted
        }


        int[] helper = new int[arr.length];


        mergeSort(arr, helper, 0, arr.length - 1);
        //     arr = 38, 27, 43, 3
        //     helper = [0,0,0,0]
        //     left = 0
        //     arr.length = 4 - 1 = 3 
    }

    private static void mergeSort(int[] arr, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        //         0 + ( 3 - 0) /2
        //         3 / 2 = 1
         // array visualization
         // [38 , 27] [ 43, 3]
         //  0     1    2    3

        mergeSort(arr, helper, left, mid);  // 38 and 27]
        mergeSort(arr, helper, mid + 1, right);
        merge(arr, helper, left, mid, right);
    }

    private static void merge(int[] arr, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = arr[i];
        }

        int i = left; // for left array starting point

        int j = mid + 1; // for right array starting point

        int k = left; // for result

        while (i <= mid && j <= right) {

            if (helper[i] <= helper[j]) {
                arr[k] = helper[i];
                i++;
            } else {
                arr[k] = helper[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            arr[k] = helper[i];
            i++;
            k++;
        }

    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3};

        System.out.println("Initial array: ");
        printArray(arr);
        mergeSort(arr);

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("Final sorted array: ");
        printArray(arr);
        System.out.println("═══════════════════════════════════════════════════════");
    }
}

