class Solution {
    //public int minDays(int[] bloomDay, int m, int k){
        public boolean make(int[]bloomDay,int m,int k,int mid){
        int count =0;
        int dayOfbm =0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                dayOfbm+=(count/k);
                count=0;
            }
        }
            dayOfbm+=(count/k);

        return dayOfbm >= m;
        }
        
    public int minDays(int[]bloomDay,int m,int k){
        if(m*k>bloomDay.length){
            return -1;
        }
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min = Math.min(min,bloomDay[i]);
            max =Math.max(max,bloomDay[i]);
        }
        int left=min;
        int right=max;
        int ans =-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(make(bloomDay,m,k,mid)){
                ans =mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
