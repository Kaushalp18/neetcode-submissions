class Solution {
    public boolean isValid(String s) {
        String stk = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(stk.length() > 0 && shouldPop(stk.charAt(stk.length()-1), s.charAt(i))){
                stk = stk.substring(0, stk.length()-1);
            } else {
                stk += s.charAt(i);
            }
        }
        return stk.length() == 0;
    }

    private boolean shouldPop(char top, char c){
        if((top == '[' && c == ']') || (top == '(' && c == ')') || (top == '{' && c == '}')){
            return true;
        }
        return false;
    }
}
