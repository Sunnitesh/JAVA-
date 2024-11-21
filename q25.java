import java.util.Stack;
public class q25{
    private int[] stack = new int[5];
    private int top = -1;

    public void push(int value) {
        if (top < stack.length - 1) stack[++top] = value;
        else System.out.println("Stack is full");
    }
    public void pop() {
        if (top >= 0) System.out.println("Popped: " + stack[top--]);
        else System.out.println("Stack is empty");
    }
    public void peek() {
        if (top >= 0) System.out.println("Top: " + stack[top]);
        else System.out.println("Stack is empty");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}

