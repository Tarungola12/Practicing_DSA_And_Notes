import java.util.Stack;

public class Lec13 {
    public static void main(String[] args) {
        System.out.println("hello.");
        // In this we will se Inorder traversal usning iterative apprach

    }

    public static void inOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null) {
            return;
        }

        do {
            if (root != null) {
                stack.add(root);
                root = root.leftNode;
            }
            if (root == null) {
                if(stack.isEmpty()){
                   return ; 
                }
                root = stack.pop();
                System.out.println(root.data);
                root = root.rightNode;
            }
        } while (!stack.isEmpty() || root != null);
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
