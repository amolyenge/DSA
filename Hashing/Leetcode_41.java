// 1)  // O(n)  and O(n)

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(num > 0){
                set.add(num);
            }
        }

        for(int i = 1; i <= nums.length + 1; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;     
    }
}

// 2) O(nlogn)   O(1)

import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int smallest = 1; 

        for (int num : nums) {
            if (num == smallest) {
                smallest++; 
            }
        }

        return smallest;   
    }
}


// 3)   O(n)  and O(1);

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct index (i.e., nums[i] = i + 1)
        for (int i = 0; i < n; i++) {
            // Swap nums[i] to its correct position while valid
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                // Swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Step 2: Find the first index i where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct, return n + 1
        return n + 1;
    }
}

