class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n =nums.length;
        int[]ans = new int[n];
        for(int i=2*n-1;i>=0;i--){
            int index =i%n;
            while(!stack.isEmpty()&&nums[stack.peek()]<=nums[index]){
                stack.pop();
            }
            if(i<n){
            if(stack.isEmpty()){
                ans[index]=-1;
            }
            else{
                ans[index]=nums[stack.peek()];
            
            }
            }
            stack.push(index);

        
        }
        return ans;
        
    }
}