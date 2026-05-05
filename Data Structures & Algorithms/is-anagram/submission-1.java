class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Long> freq1 =
        s.chars()
             .mapToObj(c -> (char) c)
             .collect(Collectors.groupingBy(
                     c -> c,
                     Collectors.counting()
             ));
        Map<Character, Long> freq2 =
        t.chars()
             .mapToObj(c -> (char) c)
             .collect(Collectors.groupingBy(
                     c -> c,
                     Collectors.counting()
             ));
        
        return freq1.equals(freq2);
    }
}
