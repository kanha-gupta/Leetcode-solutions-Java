import java.util.Stack;

public class No150_ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        //logic is, pop out latest 2 numbers from stack when a operator is detected
        //do operation on it & push result in the stack. Cycle repeats
        Stack<Integer> stack=new Stack<>();
        for(String x:tokens){
            if(x.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if (x.equals("/")) {
                int a= stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            } else if (x.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            } else if (x.equals("/")) {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else {
                stack.push(Integer.valueOf(x));
            } //keep storing values until a operator emerges
        }
        return stack.pop(); //there would be only one element by the time string array is traversed
    }
    }

