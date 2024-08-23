public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int targetVal = 30;

        int result = linearSearch(arr, targetVal);

        if (result != -1) {
            System.out.println("Value " + targetVal + " found at index " + result);
        } else {
            System.out.println("Value " + targetVal + " not found");
        }
    }
    public static int linearSearch(int[] arr, int targetVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetVal) {
                return i;
            }
        }
        return -1;
    }
}
