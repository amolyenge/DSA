class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        List<Integer> list = new ArrayList<>();

        for(char ch : p.toCharArray()){
            pCount[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            sCount[s.charAt(i) - 'a']++;

            if(i >= p.length()){
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if(Arrays.equals(sCount , pCount)){
                list.add(i - p.length() + 1);
            }
        }
        return list;
    }
}

//   HashMap

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        Map<Character, Integer> pMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int required = pMap.size(); // Number of unique chars needed to match
        int formed = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (pMap.containsKey(ch) && windowMap.get(ch).intValue() == pMap.get(ch).intValue()) {
                formed++;
            }

            // If window size is equal to p.length, check for valid anagram
            while (right - left + 1 >= p.length()) {
                if (formed == required) {
                    result.add(left);
                }

                char leftChar = s.charAt(left);
                if (pMap.containsKey(leftChar) && 
                    windowMap.get(leftChar).intValue() == pMap.get(leftChar).intValue()) {
                    formed--;
                }
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }

                left++;
            }
            right++;
        }

        return result;
    }
}
