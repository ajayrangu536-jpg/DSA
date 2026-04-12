class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
       
       public int atmost(int[]nums,int k){

        int left =0;
        int count =0;
        int result =0;
        for(int right =0;right<nums.length;right++){
            count+=nums[right]%2;
            while(count>k){
                count-= nums[left]%2;
                left++;
            }
            result+=(right-left+1);
        }
        return result;
    }
}