class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,hi=0;
        for(int pile:piles) hi= Math.max(pile,hi);

        while(l<hi){
            int m= l+(hi-l)/2;
            if(hn(piles,m)<=h){
                hi=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    private long hn(int[] piles, int k){
        long hrs=0;
        for(int pile:piles){
            hrs += (pile+k-1)/k;
        }
        return hrs;
    }
}