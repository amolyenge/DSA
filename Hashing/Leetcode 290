// O(n) both space and time  can use both HashMap also but slightly higher space as i can stor duplicate

class Solution {
public boolean wordPattern(String pattern, String s) {
    String[] arr = s.split(" ");
    if (pattern.length() != arr.length) return false;

    Map<Character, String> map = new HashMap<>();
    Set<String> used = new HashSet<>();

    for (int i = 0; i < pattern.length(); i++) {
        char ch = pattern.charAt(i);
        String word = arr[i];

        if (map.containsKey(ch)) {
            if (!map.get(ch).equals(word)) return false;
        } else {
            if (used.contains(word)) return false;
            map.put(ch, word);
            used.add(word);
        }
    }
    return true;
}

}
