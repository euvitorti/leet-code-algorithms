/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    // Initializing the first two variables of the Fibonacci sequence
    let a = 0; // Initially, a = 0 (Fibonacci of 0)
    let b = 1; // b = 1 (Fibonacci of 1)
    let fibonacci = 0; // Variable to store the current Fibonacci number

    // Loop to calculate the Fibonacci sequence up to the desired number
    for (let i = 0; i < n; i++) {
        // The next Fibonacci number is the sum of the two previous ones
        fibonacci = a + b;

        // Update the value of 'b' to be the current value of 'a'
        b = a;

        // Update 'a' with the newly calculated Fibonacci value
        a = fibonacci;
    }

    // Output the Fibonacci value after 'n' iterations
    return fibonacci;
};