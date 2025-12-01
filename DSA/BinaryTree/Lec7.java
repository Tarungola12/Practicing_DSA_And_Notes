import java.util.Scanner;

public class Lec7 {
    public static void main(String[] args) {
        /*
         🌲 TREE TRAVERSALS
         ================= WE SEE HERE DIFFERENT TYPES OF TRAVERSAL AND INORDER TRAVERSAL =============================
         👉 Tree traversal means visiting all the nodes of the tree in a specific order.

         There are two main categories:
         1. Depth-First Traversal (DFS)
         2. Breadth-First Traversal (BFS)

         ==============================================
         1️⃣ DEPTH FIRST TRAVERSAL (DFS)
         ----------------------------------------------
         a) Inorder Traversal (L → Root → R)
         b) Preorder Traversal (Root → L → R)
         c) Postorder Traversal (L → R → Root)

         Example Tree:
                  1
                 / \
                2   3
               / \    \
              5   6    4

         • Inorder   = [5 2 6 1 3 4]
         • Preorder  = [1 2 5 6 3 4]
         • Postorder = [5 6 2 4 3 1]

         ==============================================
         2️⃣ BREADTH FIRST TRAVERSAL (BFS)
         ----------------------------------------------
         a) Level Order Traversal:
             Visit nodes level by level.

         Example Tree:
                  1
                 / \
                2   3
               / \    \
              5   6    4

         • Level Order = [1 2 3 5 6 4]

         ==============================================
         ⚙️ RECURSION CALLS ANALYSIS
         ----------------------------------------------
         • For n nodes → Total recursive calls = 2n + 1
             (n for actual nodes + n+1 for nulls)

         Example: If n = 6
             → Calls = 2n + 1 = 13 calls

         • Auxiliary Space (Stack Space):
             → Depends on height of tree (h)
             → Stack size ≈ h + 2 (because recursion stack adds calls)

         ==============================================
         ✅ NOTE:
         • DFS → implemented using Recursion (Stack internally)
         • BFS → implemented using Queue
        */

        Node root = treeTraversal.createTree();
        System.out.print("\nInorder Traversal: ");
        treeTraversal.InOrder(root);
    }
}

class treeTraversal {
    static Scanner sc = new Scanner(System.in);

    // Inorder Traversal (DFS)
    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }

        // ==== DRY RUN OF INORDER (L → Root → R) ====
        // Example Tree:
        //
        //          1
        //         / \
        //        2   3
        //       / \    \
        //      5   6    4
        //
        // Call Stack Execution:
        // InOrder(1)
        //   -> InOrder(2)
        //         -> InOrder(5)
        //               -> InOrder(null) return
        //               -> print 5
        //               -> InOrder(null) return
        //         -> print 2
        //         -> InOrder(6)
        //               -> InOrder(null) return
        //               -> print 6
        //               -> InOrder(null) return
        //   -> print 1
        //   -> InOrder(3)
        //         -> InOrder(null) return
        //         -> print 3
        //         -> InOrder(4)
        //               -> InOrder(null) return
        //               -> print 4
        //               -> InOrder(null) return
        //
        // Final Output: 5 2 6 1 3 4
        // ============================================

        InOrder(root.leftNode);           // LEFT
        System.out.print(root.data + " "); // ROOT
        InOrder(root.rightNode);          // RIGHT
    }

    // Create Tree from user input
    public static Node createTree() {
        System.out.println("Enter the data (or -1 for null): ");
        int value = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (value == -1) {
            return null;
        }

        Node newNode = new Node(value);
        System.out.println("Node of " + value + " is created");

        System.out.println("Do you want left child of " + value + "? (yes/no): ");
        String left = sc.nextLine();
        if (left.equalsIgnoreCase("true") || left.equalsIgnoreCase("yes") || left.charAt(0) == 'y'
                || left.charAt(0) == 't') {
            System.out.println("Creating LEFT child of " + value);
            newNode.leftNode = createTree();
        }

        System.out.println("Do you want right child of " + value + "? (yes/no): ");
        String right = sc.nextLine();
        if (right.equalsIgnoreCase("true") || right.equalsIgnoreCase("yes") || right.charAt(0) == 'y'
                || right.charAt(0) == 't') {
            System.out.println("Creating RIGHT child of " + value);
            newNode.rightNode = createTree();
        }

        return newNode;
    }
}

// Node class
class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node leftNode, Node rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
