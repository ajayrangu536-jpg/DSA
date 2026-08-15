class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // Brute force;

      /*  int n = temperatures.length;
        int[]ans = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    ans[i]=j-i;
                    break;
                }
            }
        }
        return ans;
    */
    Stack <Integer> stack = new Stack<>();
    int n = temperatures.length;
    int[]index = new int[n];
    //Stack<Intger>stack = new Stack<>();
    for(int i=n-1;i>=0;i--){
        while(!stack.isEmpty()&& temperatures[i]>=temperatures[stack.peek()]){
            stack.pop();

        }
        if(!stack.isEmpty()){
            index[i]=stack.peek()-i;
        }
        stack.push(i);
    }
    return index;

    }
}