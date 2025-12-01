import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lec10 {
    public static void main(String[] args) {
        /*
         🌲 LEVEL ORDER TRAVERSAL (Breadth First Traversal)
         =====================================================
         Idea:
         - Traverse level by level using a Queue.
         - Process root, then left child, then right child, and so on.

         Steps:
         1. Push ROOT into queue.
         2. While queue is not empty:
            → Remove front element.
            → Print it.
            → Add its LEFT child (if exists).
            → Add its RIGHT child (if exists).

         =====================================================
         Example Tree:
                  1
                 / \
                2   3
               / \   \
              4   5   6

         Level Order = [1 2 3 4 5 6]

         =====================================================
         ⏳ Time Complexity: O(n) → every node visited once
         🛠 Space Complexity:
            - Best Case (Skewed Tree): O(1)
            - Worst Case (Perfect Tree): O(n/2) ≈ O(n)

         =====================================================
         🔁 DRY RUN (Level Order of above tree):

         Queue = [1]
         → Pop 1 → Print(1) → Push(2,3)
         Queue = [2,3]

         → Pop 2 → Print(2) → Push(4,5)
         Queue = [3,4,5]

         → Pop 3 → Print(3) → Push(6)
         Queue = [4,5,6]

         → Pop 4 → Print(4)
         Queue = [5,6]

         → Pop 5 → Print(5)
         Queue = [6]

         → Pop 6 → Print(6)
         Queue = []

         ✅ Final Output = 1 2 3 4 5 6
        */

        LevelOrderTraversal lot = new LevelOrderTraversal();

        // Create tree from user input
        Node root = lot.createTree();

        // Display Level Order Traversal
        System.out.print("\nLevel Order Traversal: ");
        lot.levelOrderTraversal(root);
    }
}

// ================= Traversal Class =================
class LevelOrderTraversal {
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

    // --------- Level Order Traversal (BFS) ---------
    public void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.print(currentNode.data + " ");

            if (currentNode.leftNode != null) {
                queue.add(currentNode.leftNode);
            }
            if (currentNode.rightNode != null) {
                queue.add(currentNode.rightNode);
            }
        }
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
