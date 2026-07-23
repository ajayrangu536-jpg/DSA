class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];

        }
        while(left<=right){
            int mid = left+(right-left)/2;
            if(cruice(weights,days,mid)){
                right=mid-1;

            }
            else{
                left=mid+1;
            }
        }
        return left;

        
    }
    public boolean cruice(int[]weights,int days,int mid){
        int requireddays =1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                requireddays+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return requireddays<=days;
    }
}