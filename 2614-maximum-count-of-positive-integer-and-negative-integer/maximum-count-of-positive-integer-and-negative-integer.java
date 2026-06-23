class Solution {
    public int maximumCount(int[] nums) {
        int mincount = 0;
        int maxcount =0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                mincount++;
            }
            else if(nums[i]>0){

                maxcount++;
            }
        }
        return Math.max(mincount,maxcount);

}
}