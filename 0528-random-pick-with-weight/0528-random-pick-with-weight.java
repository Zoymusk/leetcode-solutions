class Solution {
     private int[] prefixSum;
     private int totalSum;
     private Random random;
    public Solution(int[] w) {
        this.prefixSum= new int[w.length];
        int sum=0;       
        for(int i=0;i<w.length;i++){
            sum += w[i];
            prefixSum[i]= sum;
        }
        this.totalSum= sum;
        this.random= new Random();
    }
    
    public int pickIndex() {
        int target = random.nextInt(totalSum)+1;
        int low=0, high= prefixSum.length-1;
        while(low<high){
            int mid= low+(high-low)/2;
            if(prefixSum[mid]<target){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */