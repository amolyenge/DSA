O(n log n)  and O(1) 

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Step 1: sort the array

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }

        return false; // No duplicates
    }
}


O(n)  in space and time

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num);
        }

        return false; // no duplicates
    }
}
