public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};

        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int minVal = arr[minIndex];
            for(int k = minIndex; k>i; k--){
                arr[k] = arr[k-1];
            }
            arr[i] = minVal;
        }

        System.out.print("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}