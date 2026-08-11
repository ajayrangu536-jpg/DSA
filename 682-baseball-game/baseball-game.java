class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
         int sum =0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                sum=sum-stack.peek();
                stack.pop();
            }
            else if(operations[i].equals("D")){
            stack.push(stack.peek()*2 );
            sum=sum+stack.peek();

            }
            else if(operations[i].equals("+")){
                int first = stack.pop();
                int second =stack.peek();
                int total =first+second;
                stack.push(first);
                stack.push(total);
                sum=sum+total;
            }
            else{
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
                sum=sum+num;
            }
        }
        return sum;
        }
    }
        