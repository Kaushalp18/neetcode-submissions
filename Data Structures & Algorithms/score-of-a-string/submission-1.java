class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        for(int i = 0; i<s.length()-1; i++){
            result += Math.abs(s.codePointAt(i+1) - s.codePointAt(i));
        }

        return result;
    }
}