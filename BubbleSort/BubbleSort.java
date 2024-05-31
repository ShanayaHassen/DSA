public class BubbleSort{
    public static void main(String[] args) {
        int[] num = {23,11,90,5,68};
        int i,j;

        for(i=0 ; i<num.length-1 ; i++){
            for(j=0 ; j<num.length-1 ;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        for(i=0; i<num.length ; i++){
            System.out.print(num[i]+ " ");
        }
    }
}
