package leetjava;

class Solution {

    public int returnToBoundaryCount(int[] nums) {
        int count = 0;   // This will store how many times the ant returns to the boundary (position 0)
        int result = 0;  // This tracks the current position of the ant

        // Loop through each movement
        for (int n : nums) {
            result += n;        // Move the ant: right if positive, left if negative
            if (result == 0) {  // Check if the ant is back on the boundary after the move
                count++;        // If yes, increment the counter
            }
        }

        return count; // Return the total number of times the ant returned to the bo undary
    }
}
