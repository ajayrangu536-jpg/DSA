class Solution {
    public int minOperations(int[] nums, int x) {
        int left =0;
        int sum =0;
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int target = totalsum-x;
        if(target<0){
            return -1;
            }
       int maxLen =-1;
        for(int right =0;right<nums.length;right++){
            sum=sum+nums[right];
        while(sum>target){
            sum-=nums[left];
            left++;
        }
        if(sum==target){
            maxLen = Math.max(maxLen,right-left+1);


        }
    }
    if(maxLen == -1){
        return -1;
    }
    else{
        return nums.length - maxLen;
    }
}
}