//  Time: O(n + m) for building and comparing sets.

//  Space: O(n + m) for storing sets.


public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        Set<Integer> res1 = new HashSet<>(set1);
        Set<Integer> res2 = new HashSet<>(set2);

        res1.removeAll(set2); // Elements in set1 but not in set2
        res2.removeAll(set1); // Elements in set2 but not in set1

        return Arrays.asList(new ArrayList<>(res1), new ArrayList<>(res2));
    }
}


//---------------------------------------------------------------

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }

        return Arrays.asList(diff1, diff2);
    }
}



//  O(n + m) — where n = nums1.length, m = nums2.length

//  Space: O(n + m)
