class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[]arr =s.toCharArray();
        int n = shifts.length;
        long totalsum = 0;
        for(int i=n-1;i>=0;i--){
            totalsum=(totalsum+shifts[i])%26;
            arr[i]= (char)((arr[i]-'a'+totalsum)%26+'a');
        }
        return new String(arr);
    }
}