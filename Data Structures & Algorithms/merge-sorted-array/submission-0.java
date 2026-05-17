class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        int l = 0;
        int r = 0;
        int i = 0;

        while (l < m && r < n) {
            if (arr[l] <= nums2[r]) {
                nums1[i] = arr[l];
                l++;
            } else {
                nums1[i] = nums2[r];
                r++;
            }
            i++;
        }

        while (l < m) {
            nums1[i] = arr[l];
            l++;
            i++;
        }

        while (r < n) {
            nums1[i] = nums2[r];
            r++;
            i++;
        }
    }
}