class Solution {
    public int longestBalanced(int[] nums) {
        int max =0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            int evencount =0;
            int oddcount=0;
            for(int j=i;j<nums.length;j++){
                if(!set.contains(nums[j])){
                    if(nums[j]%2==0){
                    evencount++;

                }
                else{
                    oddcount++;
                }
                set.add(nums[j]);
            }
                if(evencount==oddcount){
                 max =Math.max(max,j-i+1);
                }
            }
        }

        return max;

    }
    }
