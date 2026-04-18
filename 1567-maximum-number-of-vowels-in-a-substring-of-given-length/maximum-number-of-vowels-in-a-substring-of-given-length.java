class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int left =0;
        int max =0;
        for(int right =0;right<s.length();right++){
            if(isVowels(s.charAt(right))){
                count++;
            }
        while(right-left+1>k){
            if(isVowels(s.charAt(left))){
                count--;
            }
        left++;
        }
        max =Math.max(max,count);

        }
    return max;
    }
    public boolean isVowels(char c){
        return c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u';
    }
}