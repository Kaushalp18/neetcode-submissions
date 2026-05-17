class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while (left <= right) {
            int k = (right + left) / 2;
            long totalTime = 0;
            if (computeTotalTime(piles, k) <= h) {
                res = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }

        return res;
    }

    private long computeTotalTime(int[] piles, int k) {
        int totalTime = 0;
        for (int pile : piles) {
            totalTime += Math.ceil((double) pile / k);
        }
        return totalTime;
    }
}
