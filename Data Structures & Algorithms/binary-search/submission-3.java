class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (right + left) / 2;
        }

        return -1;
    }
}
