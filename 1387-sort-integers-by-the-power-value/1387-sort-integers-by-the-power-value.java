class Solution {
    public int getKth(int lo, int hi, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            int steps = power(i);
            list.add(new int[]{steps, i});
        }
        list.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        return list.get(k - 1)[1];
    }
    private int power(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }
}