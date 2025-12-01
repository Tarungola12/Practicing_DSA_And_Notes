public class Recursion1 {
    public static void main(String[] args) {
        // 1> Here we start recursion
        // display(1);
        System.out.println(Factorial(5));
    }
    // Factorial of a given number --- Method No.1
    public static int Recursion(int i) {
        System.out.println("Print hello world");
        int answer;
        if (i == 1) {
            return 1;
        }
        answer = i * Recursion(i - 1);
        return answer;
    }
    
    
        // Factorial of a given number ----Method No.2
        public static int Factorial(int i) {
    
            // System.out.println("Printing of an answer...");
            int answer = i;
            if (i == 1) {
                return 1;
            }
            answer = answer * Factorial(i - 1);
            return answer;
        }
    public static void display(int i) {
        System.out.print(i + " ");
        if (i == 3) {
            return;
        }
        display(i + 1);
    }


    
}