class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stk = new ArrayDeque<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    sumScore(stk);
                    break;
                case "C":
                    invalidateScore(stk);
                    break;
                case "D":
                    doubleScore(stk);
                    break;
                default:
                    stk.push(Integer.parseInt(op));
                    break;
            }
        }

        int score = 0;
        while (!stk.isEmpty()) {
            score += stk.pop();
        }

        return score;
    }

    private void invalidateScore(Deque<Integer> stk) {
        stk.pop();
    }

    private void doubleScore(Deque<Integer> stk) {
        int top = stk.peek();
        stk.push(top * 2);
    }

    private void sumScore(Deque<Integer> stk) {
        int top1 = stk.pop();
        int top2 = stk.pop();
        stk.push(top2);
        stk.push(top1);
        stk.push(top1 + top2);
    }
}