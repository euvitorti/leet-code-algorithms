function returnToBoundaryCount(nums) {
    let count = 0;   // Counts how many times the ant returns to position 0
    let position = 0; // Tracks the current position of the ant

    for (let n of nums) {
        position += n;       // Move the ant: right if positive, left if negative
        if (position === 0) {
            count++;         // Ant is back at the boundary
        }
    }

    return count;
}

// Example usage:
const movements = [2, -2, 1, -1, 3];
console.log(returnToBoundaryCount(movements)); // Output: 2
