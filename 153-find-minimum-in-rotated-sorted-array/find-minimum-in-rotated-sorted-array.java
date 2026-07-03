import java.util.*;
class Solution {
    public int findMin(int[] nums) {
        /*int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
        
    }
    */
    int left =0;
    int right = nums.length-1;
    int ans = Integer.MAX_VALUE;
    while(left<=right){
        int mid = left+(right-left)/2;
        if(nums[left]<=nums[mid]){
             ans= Math.min(ans,nums[left]);
            left = mid+1;
        }
        else {
            ans = Math.min(ans,nums[mid]);
            right=mid-1;
        }
    }
    return ans;
    }
}