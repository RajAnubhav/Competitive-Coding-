import java.util.Stack;

public class sTACK {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // pushing elements on the top of stack
        stack.push(5);
        stack.push(10);
        stack.push(2);

        // size of stack
        int sz = stack.size();
        System.out.println(sz);

        // getting the stack
        System.out.println(stack);

        // getting the top element of the stack
        int top_element = stack.peek();
        System.out.println(top_element);

        // popping out
        stack.pop();
        top_element = stack.peek();
        System.out.println(top_element);

        // Searching element in the stack
        int pos1 = stack.search(10);
        int pos2 = stack.search(1);
        System.out.println(pos1+" "+pos2);

    }    
}
