class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int[]count= new int[128];
        int left =0;
        int target = n/4;
// To get count of a character in an array

        for(char c: s.toCharArray()){
            count[c]++;
        }
    
        int minLen =Integer.MAX_VALUE;
        //int left =0;
        for(int right =0;right<n;right++){
           // count(s.charAt(right))--;
           char ch = s.charAt(right);
           count[ch]--;
        while(left<n && count['Q']<=target&& count['W']<=target&& count['E']<=target&& count['R']<=target){
           minLen = Math.min(minLen,right-left+1);
            char leftChar =s.charAt(left);
            count[leftChar]++;
            //count[s.charAt(left)]++;
            left++;
        }
    //minLen = Math.min(minLen,right-left+1);
        }
    return minLen;
    }
}