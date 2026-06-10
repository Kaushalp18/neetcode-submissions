class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int x, y;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    y = stack.pop();
                    x = stack.pop();
                    stack.push(x + y);
                    break;
                case "-":
                    y = stack.pop();
                    x = stack.pop();
                    stack.push(x - y);
                    break;
                case "*":
                    y = stack.pop();
                    x = stack.pop();
                    stack.push(x * y);
                    break;
                case "/":
                    y = stack.pop();
                    x = stack.pop();
                    stack.push(x / y);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}
