# 136. Single Number Problem Solved: Uncover the Most Efficient Java Algorithm

https://eunhanspace.blogspot.com/2023/05/136single-number-problem-solved-uncover.html

# Problem

[Problem_Link](https://leetcode.com/problems/single-number/)

## **Problem Solving Approach**

- Find the single number in an array with a linear runtime complexity of O(n) and use only constant extra space with a complexity of O(1).
- One possible approach is to use a hash map to keep track of the frequency of each number, but this requires extra space proportional to the size of the array, which violates the space complexity constraint.
- Since O(n) and O(2n) have the same complexity of O(n), we can use a sorting algorithm to sort the array and then compare adjacent elements to find the single number.
- The approach can be summarized as follows:
    - Sort the array.
    - Iterate through the array and compare each pair of adjacent elements.
    - If the two elements are not equal, the first element is the single number, so return its value.
- This algorithm has a linear runtime complexity of O(n) and uses only constant extra space with a complexity of O(1).

# Time O(n), Space O(1)

```java
import java.util.*;

class Solution {
    /**
     * This method finds the single number in an integer array.
     *
     * @param nums an integer array
     * @return the single number
     * @throws NoSuchElementException if the single number is not found
     */
    public int singleNumber(int[] nums) {
        // Sort the given array
        Arrays.sort(nums);
        // Compare consecutive pairs of elements
        for (int i = 0; i < nums.length; i += 2) {
            // If the two elements are different, the first one is the single number, so return its value.
            if (i == nums.length - 1) return nums[i];
            else if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        // If the single number is not found until the end of the array, throw a NoSuchElementException.
        // Note that leetcode does not allow throwing a NoSuchElementException.
        // However, since the problem guarantees the existence of a single number, you can replace this line with 'return 0;'.
        throw new NoSuchElementException();
    }
}
```
