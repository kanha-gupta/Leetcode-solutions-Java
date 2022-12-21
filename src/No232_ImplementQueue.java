import java.util.Stack;

public class No232_ImplementQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public No232_ImplementQueue() {
    //this was supposed to be named MyQueue() but kept otherwise to avoid error in local system. please correct it
    }
    private int front;

    public void push(int x) {
    if(s1.empty()){
        front=x;
    }
    while (!s1.isEmpty()){
        s2.push(s1.pop());
    }
    s2.push(x);
    while (!s2.isEmpty()){
        s1.push(s2.pop());
        }
    }

    public int pop() {
            int res=s1.pop();
            if(!s1.empty()){
               front=s1.peek();
            }
            return res;
        }

    public int peek() {
            return front;
    }

    public boolean empty() {
            return s1.isEmpty();
    }
}
