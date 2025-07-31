// sorting one 
// n = number of strings in the array strs          Time	O(n * k log k)
                                                    Space	O(n * k)
// k = maximum length of a string in strs

class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {

    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    Map<String, List<String>> stringAnagramsMap = new HashMap<>();
    for (String s : strs) {
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String key = String.valueOf(arr);

      if (!stringAnagramsMap.containsKey(key))
        stringAnagramsMap.put(key, new ArrayList<>());

      stringAnagramsMap.get(key).add(s);
    }

    List<List<String>> resultList = new ArrayList<>();
    for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
      resultList.add(stringAnagrams.getValue());
    }
    return resultList;
  }
}






// a2b1 type without sorting  
| Type      | Sorting Version  | Frequency Map Version |
| --------- | ---------------- | --------------------- |
| **Time**  | `O(n * k log k)` | ✅ `O(n * k)` (faster) |
| **Space** | `O(n * k)`       | `O(n * k)`            |




class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }


        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){

            String frequencyString = frequencyString(str);
            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(frequencyString , list);
            }
        }

        return new ArrayList<>(map.values());
    }


    public String frequencyString(String str){
        int[] freq = new int[26];

        for(char character : str.toCharArray()){
            freq[character - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder();

        char character = 'a';

        for(int i : freq){
            frequencyString.append(character);
            frequencyString.append(i);
            character++;
        }

        return frequencyString.toString();
    }
}
