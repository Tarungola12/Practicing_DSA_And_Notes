public class Recursion4 {
     // // 🔁 Tail Recursion: last step is recursive call
    // void tailRec(int n) {
    //     // last mein hi khud ko call kar rahe
    //     if (n == 0)
    //         return;
    //     tailRec(n - 1);
    // }

    // ==============>>>>> easily convert into iterative approach
    
    // // 🔁 Head Recursion: recursive call happens first
    // void headRec(int n) {
    //     // pehle khud ko call, baad mein kaam
    //     if (n == 0)
    //         return;
    //     headRec(n - 1);
    //     System.out.println(n);
    // }

      // ==============>>>>> hard  convert into iterative approach

      
    // // 🔁 Tree Recursion: method calls itself multiple times
    // void treeRec(int n) {
    //     // har call mein 2 baar khud ko call kar rahe
    //     if (n == 0)
    //         return;
    //     treeRec(n - 1);
    //     treeRec(n - 1);
    // }
        
    // ==============>>>>> it worst time complexity and grow 2 ki power n.
   
    

    // // 🔁 Nested Recursion: recursion inside recursion call
    // int nestedRec(int n) {
    //     // andar bhi recursion ho raha
    //     if (n > 100)
    //         return n - 10;
    //     return nestedRec(nestedRec(n + 11));
    // }

    // ===========>>>>>>>> it's very hard to trace we generally dont't use it.
    
    // // 🔁 Direct Recursion: method calls itself directly
    // void directRec(int n) {
    //     // agar n > 0 hai toh khud ko call karo
    //     if (n > 0)
    //         directRec(n - 1);
    // }

    // // 🔁 Indirect Recursion: method A calls B, B calls A
    // void A(int n) {
    //     // A B ko call karega
    //     if (n > 0)
    //         B(n - 1);
    // }

    // void B(int n) {
    //     // B A ko call karega
    //     if (n > 0)
    //         A(n - 1);
    // }

   
    public static void main(String[] args) {
        System.out.println("Types of Recursion. ");

    }
}
