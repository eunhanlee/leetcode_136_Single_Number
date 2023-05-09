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