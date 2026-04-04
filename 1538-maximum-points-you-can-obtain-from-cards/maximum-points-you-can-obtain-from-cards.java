class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum =0;
        int maxsum =0;
        int rightsum =0;
        //int right =cardPoints.length-1;
        for(int i=0;i<k;i++){
            leftsum = leftsum+cardPoints[i];
            maxsum = leftsum;
        }
      int right = cardPoints.length-1;

        for(int i= k-1;i>=0;i--){
            leftsum = leftsum-cardPoints[i];
            rightsum = rightsum+cardPoints[right];
            right--;

        maxsum =Math.max(maxsum,rightsum+leftsum);
        }
    return maxsum;
}
}