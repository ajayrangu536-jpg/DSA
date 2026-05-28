class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum =0;
        int max =0;
        int left =0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            long windowsize= right-left+1;
            long required =(long)nums[right]*windowsize-sum;
            while(required>k){
                sum-=nums[left];
                left++;
                windowsize = right-left+1;
                required =(long) nums[right]*windowsize-sum;
            }
            max =Math.max(max,right-left+1);

        }
        return max;
    }
}