public class OptimizedBubbleSort{
    public static void main(String[] args) {
        int[] num = {7, 3, 9, 12, 11};

        for (int i = 0; i < num.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
