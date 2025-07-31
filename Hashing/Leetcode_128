// O(n log n )  and Space O(1) 

class Solution {
    public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;

    Arrays.sort(nums); // Sort the array → O(n log n)
    int longestStreak = 1;
    int currentStreak = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            continue; // skip duplicates
        } else if (nums[i] == nums[i - 1] + 1) {
            currentStreak++;
        } else {
            longestStreak = Math.max(longestStreak, currentStreak);
            currentStreak = 1;
        }
    }

    return Math.max(longestStreak, currentStreak);
    }
}


// O(n)  and space also O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            // Only start if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
