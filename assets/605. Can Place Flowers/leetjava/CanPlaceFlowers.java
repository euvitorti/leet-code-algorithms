package leetjava;

class CanPlaceFlowers {

    // Constructor for the class (not strictly necessary for this implementation)
    public CanPlaceFlowers() {}

    /**
     * This method checks if it's possible to plant 'n' flowers in the given flowerbed
     * without violating the rule that no two flowers can be adjacent.
     * 
     * @param flowerbed - an array representing the flowerbed (0 for empty, 1 for planted)
     * @param numberOfFlowersToPlant - the number of flowers we want to plant
     * @return true if it's possible to plant 'n' flowers, false otherwise
     */
    public boolean canPlaceFlowers(int[] flowerbed, int numberOfFlowersToPlant) {
        int numberOfFlowersPlanted = 0; // Keeps track of how many flowers can be planted

        // Iterate through the flowerbed to check where flowers can be planted
        for (int currentPlotIndex = 0; currentPlotIndex < flowerbed.length; currentPlotIndex++) {
            // Check if the current plot is empty and if adjacent plots (if they exist) are also empty
            if (flowerbed[currentPlotIndex] == 0 
                && (currentPlotIndex == 0 || flowerbed[currentPlotIndex - 1] == 0) // No flower to the left, or it's the first plot
                && (currentPlotIndex == flowerbed.length - 1 || flowerbed[currentPlotIndex + 1] == 0)) { // No flower to the right, or it's the last plot
                
                flowerbed[currentPlotIndex] = 1; // Plant a flower at this position
                numberOfFlowersPlanted++; // Increment the count of planted flowers
            }
        }

        // Return true if we can plant at least 'n' flowers, otherwise false
        return numberOfFlowersPlanted >= numberOfFlowersToPlant;
    }

    public static void main(String[] args) {
        
        CanPlaceFlowers flowerPlanner = new CanPlaceFlowers();

        // Test case 1: Can plant 1 flower in [1,0,0,0,1], should return true
        boolean testCaseOneResult = flowerPlanner.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);

        // Test case 2: Cannot plant 2 flowers in [1,0,0,0,1], should return false
        boolean testCaseTwoResult = flowerPlanner.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);
        
        // Print results of the test cases
        System.out.println(testCaseOneResult);
        System.out.println(testCaseTwoResult);
    }
}
