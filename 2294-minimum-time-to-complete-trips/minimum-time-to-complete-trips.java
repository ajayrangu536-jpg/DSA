class Solution {
    boolean possible(int[]time,long mid,int totalTrips){
        long actualTrips=0;
        for(int i=0;i<time.length;i++){
            actualTrips+= mid / time[i];
        }
        //if(actualTrips>=totalTrips){
           // return true;
        //}
        //return false;
        return actualTrips>=totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long min=Integer.MAX_VALUE;
        for(int i=0;i<time.length;i++){
           min=Math.min(min,time[i]);
            
        }
        long left =1;
        long right = min*(long)totalTrips;
        long ans=0;
        while(left<=right){
            long mid = left+(right-left)/2;
            if(possible(time,mid,totalTrips)){
                ans = mid;
                right=mid-1;

            }
            else{
                left= mid + 1 ;
            }
        }
        return ans;
    }
}