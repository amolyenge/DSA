// frequency array[26]    O(n)  and O(1)

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for(char ch : magazine.toCharArray()){
            count[ch - 'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(count[ch - 'a'] == 0){
                return false;
            }
            count[ch - 'a']--;
        }

        return true;
    }
}


// HashMap   O(n)  and O(1)   use this if Special characters or numbers are there as cant do in freq array type

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character , Integer> map = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch , map.get(ch) - 1);
        }

        return true;
    }
}
