class MergeSort {
    private static void mergeSort(int[] arr){
        int midIndex = arr.length / 2;

        if (arr.length <= 1){
            return;
        }

        int[] leftPart = new int[midIndex];
        int[] rightPart = new int[arr.length - midIndex];

        int l = 0, r = 0; // l = left part | r = right part

        for(; l < arr.length; l++){
            if (l < midIndex) {
                leftPart[l] = arr[l];
            } else {
                rightPart[r] = arr[l];
                r++;
            }
        }

        mergeSort(leftPart);
        mergeSort(rightPart);
        merge(arr, leftPart, rightPart);
    }

    private static void merge (int[] arr, int[] leftArray, int[] rightArray) {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        } 

        while (i < leftArraySize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArraySize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void arrayPrinter(int[] arr){
        for (int el: arr) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) { // Main Method
        int[] unsortedArray = {3, 4, 1, 2, 6};
        System.out.print("Before: ");
        arrayPrinter(unsortedArray);

        System.out.println();

        System.out.print("After: ");
        mergeSort(unsortedArray);
        arrayPrinter(unsortedArray);
    }
}