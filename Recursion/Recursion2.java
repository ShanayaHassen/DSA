public class Recursion2 {
    int[] arr = {1,2,3,4,5};
   
    public void printArr(int []arr, int i){
        if(i >= arr.length){
            return;
        }
        else{
            System.out.println(arr[i]);
            printArr(arr, i+1);
            //System.out.println(arr[i]);
        }
    }   
    public static void main(String[] args) {
        Recursion2 r2 = new Recursion2();
        r2.printArr(r2.arr, 0);
    }
}