class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());;
        for(int i = 0; i<numsList.size();i++){
            int diff = target - numsList.get(i);
            if(numsList.lastIndexOf(diff) > i){
                return new int[] {i, numsList.lastIndexOf(diff)};
            }
        }
        return new int[]{};
    }
}