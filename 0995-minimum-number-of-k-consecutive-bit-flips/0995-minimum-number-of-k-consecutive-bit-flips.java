class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n=nums.length;
        int[] flipstart= new int[n];
        int active =0;
        int count=0;
        for(int i=0;i<n;i++){
            if(i>=k) active^=flipstart[i-k];
            if(nums[i]==active){
                if(i+k>n) return -1;
                flipstart[i]=1;
                active^=1;
                count++;
            }
        }
        return count;
    }
}