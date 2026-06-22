class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

     int n = nums.length;
     for(int i=0;i<=n;i++){

     int left =0;
     int right = n-1;
     while(left<=right){
        int mid = left+(right-left)/2;
        if(nums[mid]>=i){
            right=mid-1;
        }
        else{
            left=mid+1;
        }

     }
     int count = n-left;
     if(count==i){
        return i;
     }
     }
     return -1;
    
    }
}