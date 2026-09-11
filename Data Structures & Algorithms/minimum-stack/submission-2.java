class MinStack {
    private Deque<Integer> minstk;
    private Deque<Integer> stk;

    public MinStack() {
        this.minstk = new ArrayDeque<>();
        this.stk = new ArrayDeque<>();
    }

    public void push(int val) {
        if (minstk.isEmpty() || val <= minstk.peek()) {
            minstk.push(val);
        }
        stk.push(val);
    }

    public void pop() {
        int top = stk.pop();
        if (top == minstk.peek()) {
            minstk.pop();
        }
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return minstk.peek();
    }
}
