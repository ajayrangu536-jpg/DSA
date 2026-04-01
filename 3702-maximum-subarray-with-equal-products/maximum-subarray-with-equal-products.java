class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max =0;
        for(int i=0;i<n;i++){
            int prod =1;
            int gcd = 0;
            int lcm = 1;
            for(int j=i;j<n;j++){
                prod = prod*nums[j];
                gcd = gcd(gcd,nums[j]);
                lcm = lcm(lcm,nums[j]);
                if(prod == gcd*lcm){
                    max = Math.max(max,j-i+1);
                }

            }
        }
        
        return max;
        }
        int gcd(int a ,int b){
            while(b!=0){
                int temp =b;
                b=a%b;
                a=temp;
            }
            return a;
        }
        int lcm (int a,int b){
            return a*b / gcd((int)a,(int)b);
        }
    }