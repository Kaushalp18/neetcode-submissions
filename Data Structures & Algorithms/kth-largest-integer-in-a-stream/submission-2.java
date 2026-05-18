class KthLargest {
    private int k;
    private List<Integer> numsList;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.numsList = new ArrayList<>();
        numsList.add(0);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        numsList.add(val);
        int i = numsList.size() - 1;

        while (i > 1 && numsList.get(i) < numsList.get(i / 2)) {
            int temp = numsList.get(i / 2);
            numsList.set(i / 2, numsList.get(i));
            numsList.set(i, temp);
            i = i / 2;
        }

        if (numsList.size() > k + 1) {
            pop();
        }

        if (numsList.size() == k + 1) {
            return numsList.get(1);
        }

        return -1;
    }

    private int pop() {
        if (numsList.size() == 2) {
            return numsList.remove(1);
        }

        int val = numsList.get(1);
        numsList.set(1, numsList.remove(numsList.size() - 1));
        int i = 1;

        while (2 * i < numsList.size()) {
            if (2 * i + 1 < numsList.size() && numsList.get(2 * i + 1) < numsList.get(2 * i)
                && numsList.get(i) > numsList.get(2 * i + 1)) {
                int temp = numsList.get(i);
                numsList.set(i, numsList.get(2 * i + 1));
                numsList.set(2 * i + 1, temp);
                i = 2 * i + 1;
            } else if (numsList.get(2 * i) < numsList.get(i)) {
                int temp = numsList.get(i);
                numsList.set(i, numsList.get(2 * i));
                numsList.set(2 * i, temp);
                i = 2 * i;
            } else {
                break;
            }
        }
        return val;
    }
}