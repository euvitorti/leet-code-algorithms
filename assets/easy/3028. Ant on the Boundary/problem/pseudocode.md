## Pseudocode: Return to Boundary Count

**Function:** returnToBoundaryCount(nums: list of integers) -> integer  
**Purpose:** Count how many times the ant returns to the starting position (0) after moving.

---

1. Initialize `count` as 0 // This will store the number of times the ant returns to position 0  
2. Initialize `position` as 0 // This represents the current position of the ant  

3. For each `move` in `nums`:  
    a. Add `move` to `position`  
    b. If `position` equals 0:  
        i. Increment `count` by 1  

4. Return `count`
