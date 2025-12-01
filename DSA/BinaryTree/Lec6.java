import java.util.Scanner;

public class Lec6 {

    public static void main(String[] args) {
        // IN this lecture we will se about Binary Tree Implementation using linked list

        // Node rootNode = BinaryTree.createTree();
        // System.out.println("The root element data is : " + rootNode.data);
        // BinaryTree.display(rootNode, 0);
        int [] a = {68,62,86,2,96,24,98962,8,6};
        int [] b = {89,86,24,86,32,89,6};
        int [] myarr = new int[(a.length)+(b.length)];
        int first = 0,second = 0;
        System.out.println(myarr.length);
        String s = "tarun";
        int t = s.charAt(2);
        StringBuilder e = new StringBuilder(s);
        
    }   
}

class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node() {
    }

    public Node(int data, Node leftNode, Node rigNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rigNode;
    }

    public Node(int data) {
        this.data = data;
    }

}

class BinaryTree {
    // e
    static Scanner sc = new Scanner(System.in);

    public static Node createTree() {
        System.out.println("Enter the data : ");
        int value = sc.nextInt();
        if (value == -1) {
            return null;
        }
        Node newNode = new Node(value);
        System.out.println("Node of " + value + " is created");

        System.out.println("Do you want left child of vlaue : " + value);
        sc.nextLine();
        String left = sc.nextLine();
        if (left.charAt(0) == 't' || left.charAt(0) == 'T' || left == "true" || left == "True" || left.charAt(0) == 'y'
                || left == "yes") {
            System.out.println("left child is created");
            newNode.leftNode = createTree();
        }
        System.out.println("You want right child of value : " + value);
        String right = sc.nextLine();
        if (right.charAt(0) == 't' || right.charAt(0) == 'T' || right == "true" || right == "True"
                || right.charAt(0) == 'y'
                || right == "yes") {
            System.out.println("right child is created");
            newNode.rightNode = createTree();
        }
        return newNode;
    }

    public static void display(Node root, int level) {
        // Space problem in this program we will discuss it later.
        if (root == null) {
            return ;
        }
        display(root.rightNode, ++level);

        // printing the space :
        for (int i = 0; i <= level; i++) {
            System.out.print("__");
        }
        // Printing the root:
        System.out.println(root.data);
        // Printing the left :
            display(root.leftNode, ++level);
        return;
    }
}
