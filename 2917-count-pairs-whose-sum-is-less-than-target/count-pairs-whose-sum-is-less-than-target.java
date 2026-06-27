class Solution {
    public int countPairs(List<Integer> nums, int target) {
       /* int count=0;
        for(int i=0;i<nums.size();i++){
            int sum=0;
            //int count =0;
            for(int j=i+1;j<nums.size();j++){
                sum=nums.get(i)+nums.get(j);
                if(sum<target){
                    count++;
                }
            }
        }
        return count;
        
    }
    */
    Collections.sort(nums);
    int left =0;
    int right = nums.size()-1;
    int count=0;
    while(left<right){
        if(nums.get(left)+nums.get(right)<target){
            count+=(right-left);
            left++;
        }
        else{
            right--;
        }

    }
    return count;


}
}