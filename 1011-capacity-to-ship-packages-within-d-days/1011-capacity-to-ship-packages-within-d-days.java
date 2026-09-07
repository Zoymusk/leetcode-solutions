class Solution {
    public int shipWithinDays(int[] weights, int d) {
        int l=0, h=0;
        for(int w:weights){
            l= Math.max(w,l);
            h +=w;
        }
        while(l<h){
            int m= l+(h-l)/2;
            if(dn(weights,m)<=d){
                h=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    private int dn(int[] weights, int c){
        int d=1;
        int cl=0;
        for(int w:weights){
            if(cl+w>c){
                d++;
                cl=0;
            }
            cl +=w;
        }
        return d;
    }
}