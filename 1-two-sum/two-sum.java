import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       /* Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{i,j};
        
    }
}
*/
HashMap<Integer,Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
    int complement = target-nums[i];
    if(map.containsKey(complement)){
        return new int[]{map.get(complement),i};
    }
    map.put(nums[i],i);
}
  return new int[]{};
    // throw nwe IllegalArguementException("No sums found");
}
}