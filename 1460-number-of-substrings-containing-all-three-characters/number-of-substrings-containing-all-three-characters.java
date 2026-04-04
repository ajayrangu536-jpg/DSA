class Solution {
    public int numberOfSubstrings(String s) {
        HashMap <Character,Integer> map =new HashMap<>();
        int left =0;
        int count =0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')&& map.get('a')>0 && map.get('b')>0 && map.get('c')>0){

            
                count+=(s.length()-right);
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
        }
        return count;
        
    }
}