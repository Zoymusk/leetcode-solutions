class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w= s.split(" ");
        if(w.length != pattern.length()) return false;

        Map<Character, String> ctw= new HashMap<>();
        Map<String, Character> wtc= new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c= pattern.charAt(i);
            String a= w[i];
            
            if(ctw.containsKey(c)){
                if (!ctw.get(c).equals(a)) return false;
        } else {
            if (wtc.containsKey(a)) return false;
            ctw.put(c, a);
            wtc.put(a, c);
        }
    }
    return true;
    }
}