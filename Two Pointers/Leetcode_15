public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i-1]) { 
                continue;
            } else {
                for (int j = i + 1, k = nums.length - 1; j < k; ) {
                    if (j > i + 1 && nums[j] == nums[j-1]) {
                        j++;
                    } else if (k < nums.length - 1 && nums[k] == nums[k+1]) { 
                        k--;
                    } else if (nums[j] + nums[k] < -nums[i]) { 
                        j++;
                    } else if (nums[j] + nums[k] > -nums[i]) {
                        k--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    }
                }
            }
        }
        return res;
    }
}
