class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        /*int left =0;
        int right =nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
    */
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            list.add(i);
        }
    }
    return list;
    }
}