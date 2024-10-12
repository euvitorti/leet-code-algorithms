function longestAlternatingSubarray(nums, threshold) {
    let maxLength = 0;
    let n = nums.length;

    for (let i = 0; i < n; i++) {
        // Check if the current element is even and <= threshold
        if (nums[i] % 2 === 0 && nums[i] <= threshold) {
            let currentLength = 1;
            let currentParity = nums[i] % 2;

            // Check subsequent elements for parity alternation and <= threshold
            for (let j = i + 1; j < n; j++) {
                if (nums[j] > threshold) {
                    break;
                }

                if (nums[j] % 2 !== currentParity) {
                    currentLength++;
                    currentParity = nums[j] % 2;
                } else {
                    break;
                }
            }

            // Update the maximum length found
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
    }

    return maxLength;
}

// **Test Cases:**

console.log(longestAlternatingSubarray([3, 2, 5, 4], 5)); // Output: 3
console.log(longestAlternatingSubarray([1, 2], 2));       // Output: 1
console.log(longestAlternatingSubarray([2, 3, 4, 5], 4)); // Output: 3
