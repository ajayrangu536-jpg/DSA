class Solution {
    public int numberOfSubstrings(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int count =0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>=k){
                count+=(s.length()-right);
                char  leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
        }
        return count;
        
    }
}