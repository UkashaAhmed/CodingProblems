import java.util.*;
class MinStack {

        Stack<Integer> stack;     
    Stack<Integer> minStack;  

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    
    
    public void push(int val) {
         stack.push(val);
         minStack.push(val);

            
    }
    
    public void pop() {
        
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
          
          return stack.peek();
        
        
    }
    
    public int getMin() {
        // traverse through all the elts of stack and check which is the lowest 

        int getminimum=Integer.MAX_VALUE;
        for( int i=0; i<minStack.size(); i++){

            getminimum=Math.min( getminimum, minStack.get(i));
            
        }
        return getminimum;
        
    }
}


 
