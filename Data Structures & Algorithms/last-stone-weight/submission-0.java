class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() >= 2) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x < y) {
                maxHeap.offer(y - x);
            } else if (y < x) {
                maxHeap.offer(x - y);
            }
        }

        return maxHeap.peek() == null ? 0 : maxHeap.peek();
    }
}
