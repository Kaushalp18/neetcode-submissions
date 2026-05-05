class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            int freqArr[] = new int[26];
            for(int i = 0; i<str.length();i++){
                freqArr[str.charAt(i) - 97] += 1;
            }
            String key = Arrays.toString(freqArr);
            if(map.containsKey(key)){
                map.get(key).add(str);
            } else {
                map.put(key, new ArrayList<>(List.of(str)));
            }
        }

        return new ArrayList<>(map.values());
    }
}
