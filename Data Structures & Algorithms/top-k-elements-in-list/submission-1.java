class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        hmap.forEach((key, value) -> {
            if (freq[value] == null) {
                freq[value] = new ArrayList<>();
            }
            freq[value].add(key);
        });

        int index = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] != null) {
                for (int num : freq[i]) {
                    result[index++] = num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
