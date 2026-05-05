class Solution {
    public boolean isSubsequence(String s, String t) {
        String x = "";
        int i = 0;
        while(i < s.length() && t.length() > 0){
            if(s.charAt(i) == t.charAt(0)){
                x += s.charAt(i);
                i++;
            }
            t = t.substring(1,t.length()); 
        }

        return s.equals(x);
    }
}