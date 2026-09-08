class Solution {
    public boolean isAnagram(String s, String t) {
        return s.chars()
            .boxed()
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
            .equals(
                t.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }
}
