class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        for (int i = nums[0]; i < nums[nums.length - 1]; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                result.add(i);
            }
        }
        return result;
    }
}