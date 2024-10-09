// Define the Solution constructor function that takes an array of weights
var Solution = function(w) {
    this.arrayLength = w; // Store the weights array
    this.arrayPrefixos = new Array(w.length); // Initialize an array to hold the prefix sums
    this.sum = 0; // Initialize a variable to hold the total sum of weights

    // Calculate the prefix sums
    for (let i = 0; i < w.length; i++) {
        this.sum += w[i]; // Add the current weight to the total sum
        this.arrayPrefixos[i] = this.sum; // Store the cumulative sum in the prefix sums array
    }
};

// Define the pickIndex method for the Solution class
Solution.prototype.pickIndex = function() {
    // Generate a random number between 0 (inclusive) and sum (exclusive)
    const randomNum = Math.random() * this.sum;

    // Initialize variables for binary search
    let low = 0; // Start of the search range
    let high = this.arrayPrefixos.length - 1; // End of the search range
    let mid; // Variable to hold the midpoint index

    // Perform binary search to find the index corresponding to the random number
    while (low <= high) {
        mid = Math.floor((low + high) / 2); // Calculate the midpoint index

        // If the random number is less than the prefix sum at mid, adjust the high end of the range
        if (randomNum < this.arrayPrefixos[mid]) {
            high = mid - 1; // Search in the lower half
        } else {
            low = mid + 1; // Search in the upper half
        }
    }

    // Return low, which will be the index of the first element greater than randomNum
    return low; // This index corresponds to the weighted random selection
};
