class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String val : operations) {
            if ("+".equals(val)) {
                int x1 = stack.pop();
                int x2 = stack.pop();
                stack.push(x2);
                stack.push(x1);
                stack.push(x1 + x2);
            } else if ("C".equals(val)) {
                stack.pop();
            } else if ("D".equals(val)) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(val));
            }
        }

        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        return total;
    }
}