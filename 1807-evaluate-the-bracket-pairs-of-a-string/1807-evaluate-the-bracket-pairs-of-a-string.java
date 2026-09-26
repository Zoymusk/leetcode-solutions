class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map= new HashMap<>();
        for(List<String> pair: knowledge){
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder result= new StringBuilder();
        int i=0;

        while(i<s.length()){
            if(s.charAt(i)=='('){
                int end= s.indexOf(')', i);
                String key= s.substring(i+1, end);
                result.append(map.getOrDefault(key, "?"));
                i=end+1;
            }else{
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}