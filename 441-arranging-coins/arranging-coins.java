class Solution {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
       // int result=0;
        while(left<=right){
            int mid = left+(right-left)/2;
            long result=(long)mid*(mid+1)/2;
            if(result>n){
                right=mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return right;

        
    }
}