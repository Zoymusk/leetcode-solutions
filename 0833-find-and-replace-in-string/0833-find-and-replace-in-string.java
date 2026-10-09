class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int[] replaceAt = new int[n];

        Arrays.fill(replaceAt, -1);

        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];

            if (s.startsWith(sources[i], idx)) {
                replaceAt[idx] = i;
            }
        }

        int i = 0;

        while (i < n) {
            if (replaceAt[i] != -1) {
                int j = replaceAt[i];
                result.append(targets[j]);
                i += sources[j].length();
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}