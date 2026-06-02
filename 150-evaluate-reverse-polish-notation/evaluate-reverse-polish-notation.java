class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        
        for(String x: tokens){
            if(x.equals("+")){
                res = stack.pop() + stack.pop();
                stack.push(res);
            }else if(x.equals("-")){
                int tmp = stack.pop();
                res = stack.pop() -tmp;
                stack.push(res);
            }else if(x.equals("*")){
                res = stack.pop() * stack.pop();
                stack.push(res);
            }else if(x.equals("/")){
                int tmp = stack.pop();
                res = stack.pop() / tmp;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(x));
            }    
        }
        return stack.pop();
    }
}