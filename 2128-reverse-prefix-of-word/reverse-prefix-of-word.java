class Solution {
    public String reversePrefix(String word, char ch) {
        int firstoccurence = word.indexOf(ch);
        if(firstoccurence == -1){
            return word;
        }
        Stack<Character> stack = new Stack<>();
        // 
        for(int i=0;i<=firstoccurence;i++){
            //char ch1 = word.charAt(i);
            stack.push(word.charAt(i));
         }   //stack.push()
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        for(int i=(firstoccurence+1);i<word.length();i++){
            sb.append(word.charAt(i));
        }
    return sb.toString();
        }
}