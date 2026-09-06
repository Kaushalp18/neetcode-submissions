class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int j = i;
                while (j < nums.length && nums[j] == val) {
                    j++;
                }
                if (j == nums.length) {
                    return i;
                } else {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            k = i + 1;
        }
        return k;
    }
}