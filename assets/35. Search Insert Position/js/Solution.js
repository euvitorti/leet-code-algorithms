function searchInsert(nums, target) {
    // Initialize pointers for binary search
    let low = 0; // The lower pointer starts at the beginning of the array
    let high = nums.length - 1; // The upper pointer starts at the end of the array
    let mid = 0; // Variable to store the middle index

    // While the lower pointer does not exceed the upper pointer
    while (low <= high) {
        // Calculate the middle index to divide the array
        mid = Math.floor(low + (high - low) / 2); // Avoids overflow when calculating the middle index

        // Check if the value at the middle index is equal to the target
        if (nums[mid] === target) {
            low = mid; // If found, set the lower pointer to the middle index
            break; // Exit the loop since the target has been found
        }

        // If the target is less than the value at the middle index, adjust the upper pointer
        if (target < nums[mid]) {
            high = mid - 1; // Move the upper pointer to the left
        } else {
            // If the target is greater, adjust the lower pointer
            low = mid + 1; // Move the lower pointer to the right
        }
    }

    // Return the index where the target was found or where it can be inserted
    return low; // The lower pointer indicates the insertion position
}

// Example sorted array of distinct integers
const nums = [1, 3, 5, 6];

// Example target value
const target = 5;

// Call the function and store the result
const index = searchInsert(nums, target);

// Output the result
console.log(`The target value ${target} is found or can be inserted at index: ${index}`);
