class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            set[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean consistent = true;

            for (char ch : word.toCharArray()) {
                if (!set[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }
        return count;
    }
}