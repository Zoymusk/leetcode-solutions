class Solution {
    public int maxDepth(String s) {
        int depth = 0, maxDepth = 0; // running depth and the highest it's reached

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth); // check for a new high right when it happens
            } else if (c == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}