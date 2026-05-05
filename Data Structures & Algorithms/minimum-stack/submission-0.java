class MinStack {

    private Stack<Integer> stk;
    private Stack<Integer> prefixStk;

    public MinStack() {
        this.stk = new Stack<Integer>();
        this.prefixStk = new Stack<Integer>();
    }
    
    public void push(int val) {
        stk.push(val);
        prefixStk.push( !prefixStk.isEmpty() && val>prefixStk.peek() ? prefixStk.peek() : val);
    }
    
    public void pop() {
        stk.pop();
        prefixStk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return prefixStk.peek();
    }
}
