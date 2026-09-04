class Solution {
    public int maxScore(String s) {
        int or=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                or++;
            }
        }
        int zl=0;
        int ms=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zl++;
            }else{
                or--;
            }
            int sc= zl+or;
            ms= Math.max(sc, ms);
        }
        return ms;
    }
}