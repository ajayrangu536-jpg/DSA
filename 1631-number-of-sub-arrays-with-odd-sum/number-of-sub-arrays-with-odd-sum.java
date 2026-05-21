class Solution {
    public int numOfSubarrays(int[] arr) {
        int evencount =1;
        int  oddcount =0;
        int sum =0;
        int count =0;
        int modulo = 1000000007;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==0){
               count= (count+oddcount)%modulo;
                evencount++;
            }
            else{
                count =(count+evencount)%modulo;
                oddcount++;
            }
        }
        return count;
        
    }
}