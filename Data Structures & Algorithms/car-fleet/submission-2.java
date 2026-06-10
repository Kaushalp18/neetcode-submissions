class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            pairs.add(new int[] {position[i], speed[i]});
        }
        pairs.sort((a, b) -> Integer.compare(b[0], a[0]));

        Deque<Double> stack = new ArrayDeque<>();
        double time;
        for(int pair[]: pairs){
            time = (double)(target - pair[0])/pair[1];
            if(!stack.isEmpty() && time <= stack.peek()){
                continue;
            }
            stack.push(time);
        }

        return stack.size();
    }
}
