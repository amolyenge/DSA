// O(n)  and O(1)

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < word1.length(); ++i) {
            ++cnt1[word1.charAt(i) - 'a'];
        }
        for (int i = 0; i < word2.length(); ++i) {
            ++cnt2[word2.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if ((cnt1[i] == 0) != (cnt2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
        return Arrays.equals(cnt1, cnt2);
    }
}


// Hashmap   O(n + k log k) where k = unique chars  and space O(k) 
import java.util.*;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Step 1: Check if both words use the same set of characters
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // Step 2: Check if the frequency values match (as multisets)
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}
