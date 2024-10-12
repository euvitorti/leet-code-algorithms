package leetjava;

public class SubArray {

    // Public constructor to allow instance creation
    public SubArray() {
    }

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLength = 0; // Initialize maxLength as a local variable
        int n = nums.length; // Local variable for array length

        for (int i = 0; i < n; i++) {
            // Check if the current element is even and <= threshold
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int currentLength = 1; // Initialize currentLength for this subarray
                int currentParity = nums[i] % 2; // Current parity (0 for even, 1 for odd)

                // Check subsequent elements for parity alternation and <= threshold
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] > threshold) {
                        break; // Element exceeds threshold, cannot extend subarray
                    }

                    if (nums[j] % 2 != currentParity) {
                        currentLength++; // Valid alternation, increment length
                        currentParity = nums[j] % 2; // Update parity
                    } else {
                        break; // Parity did not alternate, cannot extend further
                    }
                }

                // Update the maximum length found if current subarray is longer
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }

        return maxLength; // Return the length of the longest valid subarray
    }

    public static void main(String[] args) {
        int[] array1 = { 3, 2, 5, 4 };
        SubArray subArray = new SubArray();
        int result1 = subArray.longestAlternatingSubarray(array1, 5);
        System.out.println("Result 1: " + result1); // Expected: 3

        // Additional test cases
        int[] array2 = { 1, 2 };
        int result2 = subArray.longestAlternatingSubarray(array2, 2);
        System.out.println("Result 2: " + result2); // Expected: 1

        int[] array3 = { 2, 3, 4, 5 };
        int result3 = subArray.longestAlternatingSubarray(array3, 4);
        System.out.println("Result 3: " + result3); // Expected: 3

        int[] array4 = { 4, 5, 6, 7, 8 };
        int result4 = subArray.longestAlternatingSubarray(array4, 7);
        System.out.println("Result 4: " + result4); // Expected: 3 ([6,7,8])

        int[] array5 = { 2, 4, 6, 8 };
        int result5 = subArray.longestAlternatingSubarray(array5, 8);
        System.out.println("Result 5: " + result5); // Expected: 1 (No alternation)
    }
}
