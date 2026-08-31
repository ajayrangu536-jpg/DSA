class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch =num.charAt(i);

            while(!stack.isEmpty()&& k>0&&stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
            while(k>0){
                stack.pop();
                k--;
            }
            if(stack.isEmpty()){
                return "0";
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            sb.reverse();
        int index =0;
        while(index<sb.length()&&sb.charAt(index)=='0'){
            index++;
        }
        if(index==sb.length()){
            return "0";
        }
        return sb.toString().substring(index);
            //sb.reverse();
        }
        
    }