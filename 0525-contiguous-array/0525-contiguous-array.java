class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> firstseen= new HashMap<>();
        firstseen.put(0,-1);

        int sum=0;
        int maxlen=0;

        for(int i=0;i<nums.length;i++){
            sum +=(nums[i]==1)? 1:-1;
            if(firstseen.containsKey(sum)){
                maxlen= Math.max(maxlen, i-firstseen.get(sum));
            }else{
                firstseen.put(sum,i);
            }
        }
        return maxlen;
    }
}