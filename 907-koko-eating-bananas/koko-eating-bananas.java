class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max =0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
            max=piles[i];
        }
    }
    int left =1;
    int right=max;
    int ans = max;
    while(left<=right){
        int mid = left+(right-left)/2;
        long totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+=(piles[i]+mid-1)/mid;

        }
        if(totalhours<=h){
            ans=mid;
            right=mid-1;
        }
        else{
            left=mid+1;
        }
    }
    return ans;
}
}