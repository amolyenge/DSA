// O(n log n)    O(1)
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}




// hashmap   O(n) in bith time and space 
import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            // If the count exceeds n/2, return it
            if (count > majorityCount) {
                return num;
            }
        }

        return -1; // This line should never be reached (guaranteed majority)
    }
}



// O(n)   and  (1)   voting

class MajorityElement {

  int majorityElement(int[] num) {

    int majority = num[0], votes = 1;

    for (int i = 1; i < num.length; i++) {

      if (votes == 0) {
        votes++;
        majority = num[i];
      } else if (majority == num[i]) {
        votes++;
      } else
        votes--;

    }
    return majority;
  }

}
