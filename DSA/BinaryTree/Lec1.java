import java.util.Queue;
import java.util.Stack;

public class Lec1 {
    public static void main(String[] args) {
        /*
         🌳 TREE DATA STRUCTURE NOTES
         ============================================
         
         1️⃣ DEFINITION
         --------------------------------------------
         • A Tree is a NON-LINEAR, HIERARCHICAL data structure.  
         • It consists of NODES connected by EDGES.  
         • A tree does NOT contain cycles.  
         • One node is chosen as the ROOT, and all others branch out from it.  

            
         2️⃣ BASIC TERMINOLOGIES
         --------------------------------------------
         • ROOT → The topmost node of the tree (has no parent).  
         • NODE → A fundamental unit of a tree that stores data.  
         • PARENT → A node that has one or more child nodes 
                    (immediate predecessor of a child).  
         • CHILD → A node that is a direct successor of a parent.  
         • SIBLINGS → Nodes that share the same parent.  
         • LEAF NODE (External Node) → A node with no children (Degree = 0).  
         • NON-LEAF NODE (Internal Node) → A node with at least one child.  

         
         3️⃣ PROPERTIES OF TREE
         --------------------------------------------
         • EDGE → A connection between two nodes.  
                  If a tree has N nodes → it has exactly (N - 1) edges.  

         • ANCESTOR → Any predecessor node on the path 
                       from the ROOT to that node.  

         • DESCENDANT → Any successor node on the path 
                         from a node to LEAF nodes.  

         • SUBTREE → Any node along with all of its descendants.  
                     Even a leaf node is considered a trivial subtree.  

         
         4️⃣ DEGREE, DEPTH, HEIGHT & LEVELS
         --------------------------------------------
         • DEGREE OF NODE → Number of children of a node.  
         • DEGREE OF TREE → Maximum degree among all nodes.  

         • DEPTH OF NODE → Number of edges from ROOT to that node.  

         • HEIGHT OF NODE → Number of edges on the longest path 
                             from that node to a leaf.  

         • HEIGHT OF TREE → Height of ROOT node = Longest path 
                             from ROOT to any leaf node.  

         • LEVEL → Distance from ROOT in terms of edges.  
                   (Root = Level 0, children of root = Level 1, and so on)  

         
         5️⃣ IMPORTANT POINTS
         --------------------------------------------
         • A tree is a special type of graph (without cycles).  
         • Two main representations of tree:  
              1. Linked Representation → Using nodes & pointers.  
              2. Array Representation → Sequential storage.  

         • Common Types of Trees:  
              → Binary Tree → Each node has at most 2 children.  
              → Binary Search Tree (BST) → Left child < Parent < Right child.  
              → AVL Tree → Self-balancing BST.  
              → Heap → Complete binary tree with heap property.  
              → General Tree → No restriction on number of children.  

         ============================================
         END OF NOTES
        */
    }
}