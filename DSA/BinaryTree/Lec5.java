public class Lec5 {
    public static void main(String[] args) {

        /*
         🌲 BINARY TREE REPRESENTATION
         ==============================================

         🔹 Tree is a LOGICAL Data Structure
            → It can be represented physically in two ways:
              1. Array Representation
              2. Linked Representation


         ==============================================
         1️⃣ ARRAY REPRESENTATION
         ==============================================

         👉 Two types of indexing:
         ----------------------------------------------
         (a) 0-based Indexing:
             If node is at index i:
             • Left child  = 2*i + 1
             • Right child = 2*i + 2
             • Parent      = (i-1)/2

         (b) 1-based Indexing:
             If node is at index i:
             • Left child  = 2*i
             • Right child = 2*i + 1
             • Parent      = i/2

         ----------------------------------------------
         📌 Example (0-based indexing):

         Tree:
                 A
                / \
               B   C
              / \   \
             D   E   F

         Array Representation (0-based):
         Index :  0   1   2   3   4   5
         Value : [A,  B,  C,  D,  E,  F]

         Relations:
         • A at index 0 → Left = 1 (B), Right = 2 (C)
         • B at index 1 → Left = 3 (D), Right = 4 (E)
         • C at index 2 → Left = 5 (F), Right = 6 (null → absent)


         ----------------------------------------------
         📌 Example (1-based indexing):

         Same Tree Array (1-based):
         Index :  1   2   3   4   5   6
         Value : [A,  B,  C,  D,  E,  F]

         Relations:
         • A at index 1 → Left = 2 (B), Right = 3 (C)
         • B at index 2 → Left = 4 (D), Right = 5 (E)
         • C at index 3 → Left = 6 (F), Right = 7 (null)


         ----------------------------------------------
         ⚠️ Drawback of Array Representation:
         • Works well for COMPLETE BINARY TREE.
         • If tree is not complete → leads to MANY NULLS (wasted space).

         👉 Example (Skewed Tree):
                 A
                  \
                   B
                    \
                     C

         Array (0-based):
         Index :  0   1   2   3   4   5   6
         Value : [A, null, B, null, null, null, C]
         → Too much wasted space (many nulls)
         → Difficult to manage in big trees.


         ==============================================
         2️⃣ LINKED REPRESENTATION
         ==============================================

         👉 Each node is represented as an OBJECT with 3 fields:
             • data
             • left pointer
             • right pointer

         📌 Structure in Java:
             class Node {
                 int data;
                 Node left;
                 Node right;
             }

         👉 Example Tree:
                 A
                / \
               B   C

         Representation (Linked):
         Node(A) → left = B, right = C
         Node(B) → left = null, right = null
         Node(C) → left = null, right = null

         ✅ Advantage:
         • No wasted space
         • Flexible for ANY shape of tree
         • Used in practice (Array rep. only for Heap)

         ==============================================
         📌 SUMMARY
         ----------------------------------------------
         • Array Rep:
             - Formula (0-based): Left = 2*i+1, Right = 2*i+2, Parent = (i-1)/2
             - Formula (1-based): Left = 2*i, Right = 2*i+1, Parent = i/2
             - Best for Complete Binary Trees
             - Bad for skewed / irregular trees

         • Linked Rep:
             - Uses node objects with left/right pointers
             - No wasted memory
             - Used in real-world tree implementation

         ==============================================
        */
    }
}
