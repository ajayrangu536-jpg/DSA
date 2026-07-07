class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int)Math.sqrt(c);
        while(left<=right){
            long square = (long)left*left+(long)right*right;
                if(square == c){
                    return true;
                }
                if(square>c){
                    right--;

                }
                else{
                    left++;
                }

        }
        return false;
        
    }
}