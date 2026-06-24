class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        /*for(int i=0;i<nums1.length;i++){
            //int count =0
            //int number =0;
            //int min1 =0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    return nums1[i];

    
        }
            }
        }
        return -1;
        
    }
}
*/
int left =0;
int right =0;
while(left<nums1.length&&right<nums2.length){
    if(nums1[left]==nums2[right]){
        return nums1[left];
    }
    else if(nums1[left]<nums2[right]){
        left++;
    }
    else{
        right++;
    }
}
return -1;
    }
}