class Solution {
    public int scoreOfString(String s) {
        if(s.length() == 1){
            return 0;
        } 

        return Math.abs(s.codePointAt(1) - s.codePointAt(0)) + scoreOfString(s.substring(1,s.length()));
    }
}