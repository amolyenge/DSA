class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1; // Base case: not found
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid; // Target found
        } else if (nums[mid] > target) {
            return binarySearch(nums, low, mid - 1, target); // Search left half
        } else {
            return binarySearch(nums, mid + 1, high, target); // Search right half
        }
    }
}

 // Time Complexity: O(log n)

// Space Complexity: O(log n) (because of recursion stack)

| Version   | Time Complexity | Space Complexity |
| --------- | --------------- | ---------------- |
| Iterative | O(log n)        | O(1)             |
| Recursive | O(log n)        | O(log n)         |
