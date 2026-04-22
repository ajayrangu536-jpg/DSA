class Solution {
    public int takeCharacters(String s, int k) {
        int left =0;
        int[]count = new int[3];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        if(count[0]<k || count[1]<k || count[2]<k){
            return -1;

        }

        int max =0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            count[ch -'a']--;
            while(count[0]<k || count[1]<k || count[2]<k){
                char leftChar = s.charAt(left);
                count[leftChar -'a']++;
                left++;

            }
           // left++;
           max =Math.max(max,right-left+1);
        }
        return s.length()-max;
        
    }
}