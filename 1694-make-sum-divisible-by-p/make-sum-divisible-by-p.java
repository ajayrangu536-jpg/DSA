class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int target = (int)(totalsum%p);
        if(target==0){
            return 0;
        }
        long sum =0;
        int minLen = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int currentreminder = (int)(sum%p);
            int required = (currentreminder -target+p)%p;
            if(map.containsKey(required)){
                int len =i-map.get(required);
                minLen =Math.min(minLen,len);
            }
                map.put(currentreminder,i);
            }
    if(minLen == nums.length){
        return -1;
    }
    else{
        return minLen;
    }

        }
    }