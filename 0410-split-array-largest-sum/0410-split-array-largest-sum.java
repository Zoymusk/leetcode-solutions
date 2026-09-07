class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,h=0;
        for(int num:nums){
            l= Math.max(l,num);
            h += num;
        }
        while(l<h){
            int m=l+(h-l)/2;
            if(sn(nums,m)<= k){
                h=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    private int sn(int[] nums, int c){
        int s=1;
        long cs= 0;
        for(int num:nums){
            if(cs+num>c){
                s++;
                cs=0;
            }
            cs +=num;
        }
        return s;
    }
}