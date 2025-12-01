import java.util.LinkedList;
import java.util.Stack;

public class Lec12 {
    public static void main(String[] args) {
        // In this we will see all the binary traversal using iterative approach :
        preOrderTraversal(new Node(5));
    }

    public static void preOrderTraversal(Node root) {
        Node ref = root;
        Stack<Node> stack = new Stack<>();
        // we use here stack for iterations
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                System.out.println(root.data);
                stack.push(root);
                root = root.leftNode;
            }
            else{
                root = stack.pop();
                root = root.rightNode;
            }
            
        }
        // here are also one more way to print this :
        



    }
}

// ================= Node Class =================
class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node(int data) {
        this.data = data;
    }
}
