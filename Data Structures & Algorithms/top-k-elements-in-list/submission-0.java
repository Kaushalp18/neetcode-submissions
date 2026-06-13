class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int counts[] = new int[2001];
        for (int num : nums) {
            counts[num + 1000]++;
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < 2001; i++) {
            if (counts[i] == 0) {
                continue;
            }

            maxHeap.add(new int[] {counts[i], i - 1000});
        }

        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll()[1];
        }

        return result;
    }
}
