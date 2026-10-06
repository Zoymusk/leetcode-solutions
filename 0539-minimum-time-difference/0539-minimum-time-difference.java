class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes= new ArrayList<>();
        for(String t: timePoints){
            int h=Integer.parseInt(t.substring(0,2));
            int m=Integer.parseInt(t.substring(3,5));
            minutes.add(h*60+m);
        }
        Collections.sort(minutes);
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<minutes.size();i++){
            mindiff= Math.min(mindiff, minutes.get(i)-minutes.get(i-1));
        }
        int wrapdiff= (minutes.get(0)+1440)-minutes.get(minutes.size()-1);
        mindiff= Math.min(mindiff,wrapdiff);
        return mindiff;
    }
}