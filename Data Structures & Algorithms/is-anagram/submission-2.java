class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for (char c : s.toCharArray()) {
            smap.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            tmap.merge(c, 1, Integer::sum);
        }

        return smap.equals(tmap);
    }
}
