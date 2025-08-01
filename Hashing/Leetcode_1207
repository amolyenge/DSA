class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : arr) {
            cnt.merge(x, 1, Integer::sum);
        }
        return new HashSet<>(cnt.values()).size() == cnt.size();
    }
}

// O(n)  both time and space 

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001]; 

        for (int num : arr) {
            freq[num + 1000]++;
        }

        boolean[] seen = new boolean[arr.length + 1];

        for (int count : freq) {
            if (count == 0) continue;

            if (seen[count]) return false;
            seen[count] = true;
        }

        return true;
    }
}
  same complexities
