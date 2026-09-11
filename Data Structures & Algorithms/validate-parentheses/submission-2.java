class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        Set<String> validBrackets = Set.of("{}", "[]", "()");
        for (char c : s.toCharArray()) {
            if (validBrackets.contains("" + stk.peek() + c)) {
                stk.pop();
                continue;
            }
            stk.push(c);
        }

        return stk.isEmpty();
    }
}
