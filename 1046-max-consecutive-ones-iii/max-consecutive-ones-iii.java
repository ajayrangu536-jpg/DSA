class Solution {
    public int longestOnes(int[] nums, int k) {
       // HashMap <Integer,Integer>map = new HashMap<>();
        int left =0;
        int zero =0;
        int max =0;
        for(int right =0;right<nums.length;right++){
            //map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;

                }
                left++;
                //map.put(nums[left],map.get(nums[left]-1));
            }
            max = Math.max(max,right-left+1);

        }
        return max;
    }
}