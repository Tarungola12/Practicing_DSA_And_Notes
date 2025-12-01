import java.util.Scanner;

public class Lec8 {
    public static void main(String[] args) {
        // ==================== Lecture 8 : preOrder Traversal =====================
        // Traversal ka matlab : ek specific order mein tree ke nodes ko visit karna.
        //
        // Depth-First Traversal ke 3 types hote hain :
        // 1> InOrder    -> Left, Root, Right
        // 2> preOrder   -> Root, Left, Right
        // 3> PostOrder  -> Left, Right, Root
        //
        // Aaj hum preOrder Traversal karenge :
        // Rule = ROOT -> LEFT -> RIGHT
        //
        // Example Tree :
        //
        //              10
        //             /  \
        //           20    30
        //          / \     \
        //         40  50    60
        //
        // preOrder Output = 10 20 40 50 30 60
        //
        // ---------------- Complexity ----------------
        // Time Complexity = O(n) [Har ek node ko ek hi baar visit karenge]
        // Recursive Calls = 2n + 1  (n nodes + n+1 null calls)
        // Space Complexity = Height of tree + 2 (Stack space)
        // ============================================================

        Node root = PreOrder.createTree(); // User input se tree create
        System.out.println("\npreOrder Traversal of Tree :");
        PreOrder.preOrder(root); // preOrder traversal print
    }
}

class PreOrder {
    static Scanner sc = new Scanner(System.in);

    // ============= Create Tree =============
    public static Node createTree() {
        System.out.println("Enter the data (or -1 for null): ");
        int value = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // agar -1 diya toh matlab null (no child)
        if (value == -1) {
            return null;
        }

        Node newNode = new Node(value);
        System.out.println("Node of " + value + " is created");

        // left child puchna
        System.out.println("Do you want LEFT child of " + value + "? (yes/no): ");
        String left = sc.nextLine();
        if (left.equalsIgnoreCase("true") || left.equalsIgnoreCase("yes") ||
            left.charAt(0) == 'y' || left.charAt(0) == 't') {
            System.out.println("Creating LEFT child of " + value);
            newNode.leftNode = createTree();
        }

        // right child puchna
        System.out.println("Do you want RIGHT child of " + value + "? (yes/no): ");
        String right = sc.nextLine();
        if (right.equalsIgnoreCase("true") || right.equalsIgnoreCase("yes") ||
            right.charAt(0) == 'y' || right.charAt(0) == 't') {
            System.out.println("Creating RIGHT child of " + value);
            newNode.rightNode = createTree();
        }

        return newNode;
    }

    // ============= preOrder Traversal =============
    // Rule : Root -> Left -> Right
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        // ==== DRY RUN EXAMPLE TREE (10,20,30,40,50,60) ====
        // Call Stack sequence:
        // preOrder(10)
        //   -> print 10
        //   -> preOrder(20)
        //         -> print 20
        //         -> preOrder(40)
        //               -> print 40
        //               -> preOrder(null) return
        //               -> preOrder(null) return
        //         -> preOrder(50)
        //               -> print 50
        //               -> preOrder(null) return
        //               -> preOrder(null) return
        //   -> preOrder(30)
        //         -> print 30
        //         -> preOrder(null) return
        //         -> preOrder(60)
        //               -> print 60
        //               -> preOrder(null) return
        //               -> preOrder(null) return
        // ==================================================

        System.out.print(root.data + " ");   // ROOT
        preOrder(root.leftNode);             // LEFT
        preOrder(root.rightNode);            // RIGHT
    }
}

// ============= Node Class =============
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
