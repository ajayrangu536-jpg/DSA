class Solution {
    public String removeDuplicateLetters(String s){

        Stack<Character> stack = new Stack<>();

        HashSet<Character>set = new HashSet<>();

        int[]freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            freq[ch-'a']--;
            if(set.contains(ch)){
                continue;
            }

        while(!stack.isEmpty() && stack.peek()>ch && freq[stack.peek()-'a']>0){
            set.remove(stack.pop());
        }
        set.add(ch);
        stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());

        }
        return sb.reverse().toString();
        }
}

    