public class BubbleSort{
    public static void main(String[] args) {
        int[] num = {23,11,90,5,68};
        int i,j;

        // Bubble Sort
        for(i=0 ; i<num.length-1 ; i++){
            for(j=0 ; j<num.length-1 ;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for(i=0; i<num.length ; i++){
            System.out.print(num[i]+ " ");
        }

        // Optimized Bubble Sort
        for (i = 0; i < num.length-1; i++) {
            boolean swapped = false;
            for (j = 0; j < num.length-1-i; j++) {
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
        System.out.println();
        System.out.print("Sorted array: ");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
