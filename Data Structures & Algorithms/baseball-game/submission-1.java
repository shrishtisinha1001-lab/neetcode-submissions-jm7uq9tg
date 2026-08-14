class Solution {
    public int calPoints(String[] operations) {
        
        int ans = 0;
       

        Stack<Integer> stack = new Stack<>();

        for(String s:operations)
        {
            //"C" -
             //Invalidate and remove the previous score, record = [1, 2]. = stack.pop()
            if(s.equals("C"))
            {
                int rem_ele = stack.pop();
                ans-=rem_ele;
            }
            else if(s.equals("D"))
            {
                int temp = stack.peek()*2;
                stack.push(temp);
                ans+=temp;
            }
            else if(s.equals("+"))
            {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int sum = temp1+temp2;
                stack.push(temp2);
                stack.push(temp1);  
                stack.push(sum);
                ans+=sum;
            }
            else{
                int val = Integer.parseInt(s);
                stack.push(val);
                ans+=val;
            }
        }

        return ans;
        
        
    }
}