package leetjava;

class Solution {

    // Method that calculates the Fibonacci number for a given 'n'
    public static int fib(int n) {
        // Initializing the first two variables of the Fibonacci sequence
        int a = 0; // Initially, a = 0 (Fibonacci of 0)
        int b = 1; // b = 1 (Fibonacci of 1)
        int fibonacci = 0; // Variable to store the current Fibonacci number

        // Loop to calculate the Fibonacci sequence up to the desired number
        for (int i = 0; i < n; i++) {
            // The next Fibonacci number is the sum of the two previous ones
            fibonacci = a + b;

            // Update the value of 'b' to be the current value of 'a'
            b = a;

            // Update 'a' with the newly calculated Fibonacci value
            a = fibonacci;
        }

        // Return the Fibonacci value after 'n' iterations
        return fibonacci;
    }

    // Main method that runs the program
    public static void main(String[] args) {
        // Call the fib function with 'n = 7' and print the result
        System.out.println(fib(7)); // The Fibonacci number for 7 will be calculated
    }
}
