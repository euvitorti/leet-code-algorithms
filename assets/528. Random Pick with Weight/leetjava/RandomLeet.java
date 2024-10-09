package leetjava;

import java.util.Random;

class RandomLeet {

    // Array to hold the original weights.
    private int[] arrayLength;

    // Array to hold the prefix sums, which represent the cumulative sum of weights.
    private int[] arrayPrefixos;

    // Sum of all weights.
    private int sum = 0;

    // Random number generator used to pick a weighted index.
    private Random random = new Random();

    // Constructor: initializes the object with an array of weights (w) and calculates prefix sums.
    public RandomLeet(int[] w) {
        // Store the original weights in arrayLength.
        this.arrayLength = w;

        // Initialize the array to hold prefix sums with the same length as the weights array.
        this.arrayPrefixos = new int[w.length];

        // Call the method to compute the prefix sums based on the weights.
        allWeigth();
    }

    // Method to pick an index randomly based on the weights.
    public int pickIndex() {
        // If the total sum of weights is 0 or less, return 0 (unlikely given the problem constraints).
        if (sum <= 0) {
            return 0;
        }

        // Generate a random number between 0 and the total sum (exclusive).
        int buscar = random.nextInt(0, sum);

        // Perform a binary search to find the correct index based on the random number.
        int low = 0;
        int high = arrayPrefixos.length - 1;
        int mid = 0;

        // Binary search loop: keep dividing the search space until low is greater than high.
        while (low <= high) {
            // Calculate the middle index.
            mid = low + (high - low) / 2;

            // If the random number is less than the value at mid, search in the lower half.
            if (buscar < arrayPrefixos[mid]) {
                high = mid - 1;
            } 
            // Otherwise, search in the upper half.
            else {
                low = mid + 1;
            }
        }

        // Return the index that corresponds to the generated random number (this will be low).
        return low;
    }

    // Method to calculate the prefix sums based on the weights.
    public void allWeigth() {
        // Loop through each weight in the array.
        for (int i = 0; i < arrayLength.length; i++) {
            // Add the current weight to the total sum.
            sum += arrayLength[i];

            // Store the cumulative sum in the prefix array.
            arrayPrefixos[i] = sum;
        }
    }

    // Main method for testing.
    public static void main(String[] args) {
        // Example array of weights.
        int[] values = { 1, 3 };

        // Instantiate the RandomLeet object with the array of weights.
        RandomLeet randomLeet = new RandomLeet(values);

        // Call pickIndex and print the result (the randomly chosen index).
        System.out.println(randomLeet.pickIndex());
    }
}
