class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Long, Integer> map = new HashMap<>();
        int maxGap = 0;
        for (List<Integer> row : wall) {
            long sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                maxGap = Math.max(maxGap, map.get(sum));
            }
        }
        return wall.size() - maxGap;
    }
}