import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {
        // System.out.println("hi");
        Stack<Integer> stack = new Stack<>();
        // stack.add(5);
        // stack.add(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        // System.out.println(stack.size());
        // while (!stack.empty()) {
        //     System.out.println(stack.pop());
        // }
        System.out.println(stack);

        // satck of object type
        Stack<Object> object = new Stack<>();
        object.push(5);
        object.push(10);
        object.push(15);
        object.push(20);
        object.push("tarun");
        object.push(50.25);
        object.push(false);

    }
}
