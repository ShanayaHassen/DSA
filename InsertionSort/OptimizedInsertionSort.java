public class OptimizedInsertionSort {

    public static void main(String[] args) {
        int[] arr = {15, 6, 10, 3, 5};
        
        for (int i = 1; i < arr.length; i++) {
            int curVal = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curVal) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curVal;
        }
        
        for(int i=0; i<arr.length; i++){
       		System.out.print(arr[i] + " ");
       }
    }
}
