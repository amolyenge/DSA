//  O(N)  O(1)

public class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // 1st pass: build frequency array
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // 2nd pass: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}


// HahsMap  O(n)  and (1)  if lowercase if uppercase then k set of letters

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // 1st pass: build frequency map
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 2nd pass: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
