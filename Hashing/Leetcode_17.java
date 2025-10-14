import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return result; // empty input
        }

        // Mapping digits to letters using HashMap
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(result, digits, map, 0, new StringBuilder());

        return result;
    }

    // Recursive function for backtracking
    private void backtrack(List<String> result, String digits, Map<Character, String> map, int index, StringBuilder current) {
        // Base case: if the combination length == digits length
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get current digit and its mapped characters
        char digit = digits.charAt(index);
        String letters = map.get(digit);

        // Explore all options for current digit
        for (char letter : letters.toCharArray()) {
            current.append(letter); // choose
            backtrack(result, digits, map, index + 1, current); // explore
            current.deleteCharAt(current.length() - 1); // un-choose (backtrack)
        }
    }
}
