class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }

        if (map.size() < 3) {
            return -1;
        }

        int[] top = new int[3];
        Arrays.fill(top, 0);

        for (int value : map.values()) {
            if (value > top[0]) {
                top[2] = top[1];
                top[1] = top[0];
                top[0] = value;
            } else if (value > top[1]) {
                top[2] = top[1];
                top[1] = value;
            } else if (value > top[2]) {
                top[2] = value;
            }
        }
        return top[0] + top[1] + top[2];
    }
}