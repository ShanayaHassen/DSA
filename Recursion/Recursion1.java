public class Recursion1{
    public void printHello(int n){
        if (n>0){
            System.out.println("Hello");
            printHello(n-1);
        } 
    }

    public static void main(String[] args) {
        Recursion1 r1 = new Recursion1();
        r1.printHello(10);
    }
}