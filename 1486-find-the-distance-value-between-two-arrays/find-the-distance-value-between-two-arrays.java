class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        /* int left =0;
        int right =0;
        while(left<arr1.length && right<arr2.length){
           // if(arr1[left]-arr2[right]== d){
                
                //return arr1[left];
            if(arr1[left]-arr2[right]<=d){
                //eturn arr1[left];
                return arr1[left];
                //left++;
            }
            else if(arr1[left]-arr2[right]>d){
                right++;
        
            }
            else{
                left++;
            }
        }
        return -1;
        
        }
        */
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            //int count =0;
            for (int j =0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    found = true;
                    break;
                }
            }
            if(!found){
                count++;
            }
    }
    return count;
}
}