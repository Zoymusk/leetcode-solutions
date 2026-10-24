class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f % 2 == 1) {
                maxOdd = Math.max(maxOdd, f);
            } else if (f > 0) {
                minEven = Math.min(minEven, f);
            }
        }
        return maxOdd - minEven;
    }
}