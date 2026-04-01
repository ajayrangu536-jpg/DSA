class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int maxcount =0;
        int length =0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxcount = Math.max(maxcount,map.get(ch));
        while((right-left+1)-maxcount>k){
            char leftChar= s.charAt(left);
            map.put(leftChar,map.get(leftChar)-1);
            left++;
        }
        length = Math.max(length,right-left+1);

        
        
    }
    return length;
}
}