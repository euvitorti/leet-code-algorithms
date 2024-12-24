class CanPlaceFlowers {

    /**
     * This method checks if it's possible to plant 'n' flowers in the given flowerbed
     * without violating the rule that no two flowers can be adjacent.
     * 
     * @param {number[]} flowerbed - An array representing the flowerbed (0 for empty, 1 for planted).
     * @param {number} numberOfFlowersToPlant - The number of flowers we want to plant.
     * @returns {boolean} - True if it's possible to plant 'n' flowers, false otherwise.
     */
    canPlaceFlowers(flowerbed, numberOfFlowersToPlant) {
        let numberOfFlowersPlanted = 0; // Keeps track of how many flowers can be planted.

        // Iterate through the flowerbed to check where flowers can be planted.
        for (let currentPlotIndex = 0; currentPlotIndex < flowerbed.length; currentPlotIndex++) {
            // Check if the current plot is empty and if adjacent plots (if they exist) are also empty.
            if (flowerbed[currentPlotIndex] === 0 &&
                (currentPlotIndex === 0 || flowerbed[currentPlotIndex - 1] === 0) && // No flower to the left, or it's the first plot.
                (currentPlotIndex === flowerbed.length - 1 || flowerbed[currentPlotIndex + 1] === 0)) { // No flower to the right, or it's the last plot.
                
                flowerbed[currentPlotIndex] = 1; // Plant a flower at this position.
                numberOfFlowersPlanted++; // Increment the count of planted flowers.
            }
        }

        // Return true if we can plant at least 'n' flowers, otherwise false.
        return numberOfFlowersPlanted >= numberOfFlowersToPlant;
    }
}

// Testing the implementation.
const flowerPlanner = new CanPlaceFlowers();

// Test case 1: Can plant 1 flower in [1,0,0,0,1], should return true.
const testCaseOneResult = flowerPlanner.canPlaceFlowers([1, 0, 0, 0, 1], 1);

// Test case 2: Cannot plant 2 flowers in [1,0,0,0,1], should return false.
const testCaseTwoResult = flowerPlanner.canPlaceFlowers([1, 0, 0, 0, 1], 2);

// Print results of the test cases.
console.log(testCaseOneResult); // true
console.log(testCaseTwoResult); // false
