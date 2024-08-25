public class RabbitProblem {

    // Method to calculate Fibonacci number using recursion
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method
    public static void main(String[] args) {
        RabbitProblem rabbitProblem = new RabbitProblem();
        int months = 12; // Number of months
        int rabbitPairs = rabbitProblem.fibonacci(months);
        System.out.println("Number of rabbit pairs after " + months + " months: " + rabbitPairs);
    }
}
