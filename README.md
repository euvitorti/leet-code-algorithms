# LeetCode Challenges

Welcome to my LeetCode challenges repository! Here, you will find solutions to various problems I have solved on the platform, using **Java** and **JavaScript**.

## About

**[LeetCode](https://leetcode.com/)** is an amazing platform for practicing programming logic and algorithms. In this repository, I share the solutions I have developed, with comments and explanations to help understand the solutions.

## Code Adaptation and Naming Conventions
When using my code solutions as references, it’s important to keep in mind that the way the classes and methods are structured may differ slightly from the standard format required by LeetCode. Here are some key points to consider:

### Class Naming:

In LeetCode problems, the class is typically named Solution. This is a requirement for their platform, as the system expects this naming convention to instantiate the solution object.
In my local implementations, I often use descriptive names based on the problem context, such as RandomLeet. This helps clarify the purpose of the class when running the code locally.
Adaptation for LeetCode:

When copying code from my repository for use on LeetCode, you will need to change the class name to Solution. This small adjustment is necessary to align with LeetCode’s expectations.
Additionally, ensure that the method signatures match those specified in the problem description on LeetCode. This may involve renaming methods or adjusting parameters to meet the required format.

### Code Purpose:

My code is designed to serve as a solution reference and to provide inspiration for solving similar problems. While you can learn from the implementation, I advise against directly copying the code without understanding it fully.

### Example Implementation:

Below is my Java implementation for a weighted random index picker:
```
  package leetjava;

import java.util.Random;

class RandomLeet {
    private int[] arrayLength;
    private int[] arrayPrefixos;
    private int sum = 0;
    private Random random = new Random();

    public RandomLeet(int[] w) {
        this.arrayLength = w;
        this.arrayPrefixos = new int[w.length];
        allWeigth();
    }

    public int pickIndex() {
        if (sum <= 0) {
            return 0;
        }
        int buscar = random.nextInt(0, sum);
        int low = 0;
        int high = arrayPrefixos.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (buscar < arrayPrefixos[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public void allWeigth() {
        for (int i = 0; i < arrayLength.length; i++) {
            sum += arrayLength[i];
            arrayPrefixos[i] = sum;
        }
    }

    public static void main(String[] args) {
        int[] values = { 1, 3 };
        RandomLeet randomLeet = new RandomLeet(values);
        System.out.println(randomLeet.pickIndex());
    }
}
```

LeetCode Implementation:

And here’s how the code would look in the LeetCode format:
```
  class Solution {
    private int[] arrayLength;
    private int[] arrayPrefixos;
    private int sum = 0;
    private Random random = new Random();

    public Solution(int[] w) {
        this.arrayLength = w;
        this.arrayPrefixos = new int[w.length];
        allWeigth();
    }

    public int pickIndex() {
        if (sum <= 0) {
            return 0;
        }
        int buscar = random.nextInt(0, sum);
        int low = 0;
        int high = arrayPrefixos.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (buscar < arrayPrefixos[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public void allWeigth() {
        for (int i = 0; i < arrayLength.length; i++) {
            sum += arrayLength[i];
            arrayPrefixos[i] = sum;
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
```

## Conclusion
By keeping these points in mind, you can effectively adapt my solutions for use on LeetCode while ensuring you understand the underlying logic and structure of the code. Feel free to use my implementations as a guide for developing your own solutions!

## How to Contribute

If you have suggestions for improvements or found any errors, feel free to open an issue or submit a pull request!
