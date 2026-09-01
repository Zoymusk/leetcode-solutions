class Solution {
    public int countSeniors(String[] details) {
        int c=0;

        for(String s: details){
            String age= s.substring(11,13);
            int a= Integer.parseInt(age);
            if(a>60){
                c++;
            }
        }
        return c;
    }
}