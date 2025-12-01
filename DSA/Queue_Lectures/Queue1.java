
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        // -------> Introduction to queue data structure :
        // 1> Queue is a linear data structure and it is follow FIFO pricipal

        // 2> Enqueue is add , dequeue is removed an element , peek is view front
        // element ,

        // 3> is empty and size are fundamental operation. we maintain also two things
        // one is front and another is rear.

        // 4> ---------------> Queue is an interface in java so we implement or java
        // implement using linked list and many more but we will se in linked list
        // format.

        // Implementation of queue using linked list :
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.add(5);
        queue.add(63);
        // Printing an queue.
        System.out.println(queue);
        // Some operation on queue.

        System.out.println(queue.remove());// removing an element using remove method.
        System.out.println(queue.poll());// poll not give exception while remove give to remove and element.
        System.out.println(queue.peek());// peek is give null while element give us exception.
        System.out.println(queue.element());

        // Different implementaion of queue :
        Queue<Integer> obj2 = new ArrayDeque<>();
        Queue<Integer> obj3 = new PriorityQueue<>();
        Queue<Integer> obj4 = new LinkedList<>();


        // That all in this lecture and nothing more in this lecture.

    }
}

