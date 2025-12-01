import java.util.Scanner;

public class Lec9 {
    public static void main(String[] args) {
        /*
         🌲 POSTORDER TRAVERSAL
         ==============================================
         Rule:  L → R → Root
         ----------------------------------------------
         Means:
         1. Visit LEFT subtree
         2. Visit RIGHT subtree
         3. Visit ROOT node
         
         Example Tree:
                  1
                 / \
                2   3
               / \    
              4   5    

         Postorder = [4 5 2 3 1]

         ==============================================
         ⏳ Time Complexity: O(n) → every node visited once
         🛠 Stack Space: O(h) → h = height of tree
         
         ==============================================
         🔁 DRY RUN of Postorder(1):
         
         postOrder(1)
            → postOrder(2)
                 → postOrder(4) → print(4)
                 → postOrder(5) → print(5)
                 → print(2)
            → postOrder(3) → print(3)
            → print(1)

         Final Output = 4 5 2 3 1
        */

        // Create tree from user input
        PostOrderTraversal pot = new PostOrderTraversal();
        Node root = pot.createTree();

        // Display Postorder Traversal
        System.out.print("\nPostorder Traversal: ");
        pot.postOrder(root);
    }
}

// ================= Traversal Class =================
class PostOrderTraversal {
    static Scanner sc = new Scanner(System.in);

    // --------- Create Tree from User Input ---------
    public Node createTree() {
        System.out.println("Enter the data (or -1 for null): ");
        int value = sc.nextInt();
        sc.nextLine(); // consume newline

        if (value == -1) {
            return null; // no node created
        }

        Node newNode = new Node(value);
        System.out.println("Node of " + value + " is created");

        // Left child
        System.out.println("Do you want LEFT child of " + value + "? (yes/no): ");
        String left = sc.nextLine();
        if (left.equalsIgnoreCase("yes") || left.equalsIgnoreCase("true") ||
            left.charAt(0) == 'y' || left.charAt(0) == 't') {
            System.out.println("Creating LEFT child of " + value);
            newNode.leftNode = createTree();
        }

        // Right child
        System.out.println("Do you want RIGHT child of " + value + "? (yes/no): ");
        String right = sc.nextLine();
        if (right.equalsIgnoreCase("yes") || right.equalsIgnoreCase("true") ||
            right.charAt(0) == 'y' || right.charAt(0) == 't') {
            System.out.println("Creating RIGHT child of " + value);
            newNode.rightNode = createTree();
        }

        return newNode;
    }

    // --------- PostOrder Traversal (L → R → Root) ---------
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        // Step 1 → Traverse LEFT subtree
        postOrder(root.leftNode);

        // Step 2 → Traverse RIGHT subtree
        postOrder(root.rightNode);

        // Step 3 → Visit ROOT
        System.out.print(root.data + " ");
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
