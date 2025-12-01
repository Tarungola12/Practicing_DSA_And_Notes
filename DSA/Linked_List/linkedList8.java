class Node8 {
    Node8 prev;
    int data;
    Node8 next;

    public Node8(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class linkedList8 {
    Node8 head;
    Node8 tail;
    int size;

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Your list is empty.");
            return;
        }
        Node8 temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.print("End");
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            System.out.println("Your list is empty.");
            Node8 newNode = new Node8(data);
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = tail;
            return;
        }
        // case 1 : if we have tail only
        // Node8 newNode = new Node8(data);
        // tail.next = newNode;
        // newNode.prev = tail;
        // tail = newNode;
        // newNode.next = head;
        // head.prev = tail;
        // System.out.println("inserted successfully.");

        // case 2 : if we have head only then what we can do is :
        Node8 newNode = new Node8(data);
        head.prev = tail;
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        newNode.next = head;
        head.prev = tail;
        System.out.println("inserted successfully.");

    }

    public void insertAtPosition(int position, int data) {
        if (position <= 0) {
            System.out.println("Enter valid position.");
            return;
        }
        if (head == null) {
            System.out.println("Your list is empty.");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node8 temp = head;
        int i = 1;
        do {
            temp = temp.next;
            i++;
        } while (temp != head && i < position);
        if (temp == head && i != position) {
            System.out.println("Enter valid position.");
            return;
        }
        if (temp == head && i == position) {
            insertAtEnd(data);
            return;
        }
        Node8 newNode = new Node8(data);
        // newNode.next = temp.next;
        // newNode.prev = temp.prev;
        // temp.prev.next = newNode;
        // temp.next.prev = newNode;
        // temp.next1

        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev = newNode;
        newNode.prev.next = newNode;
        System.out.println("Insered successfully.");
    }

    public void insertAtBeginning(int data) {
        if (head == null) {
            System.out.println("Your list is empty.");
            Node8 newNode = new Node8(data);
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = tail;
            return;
        }
        // Case 1 : if we have head only.

        // Node8 newNode = new Node8(data);
        // newNode.prev = head.prev;
        // newNode.next = head;
        // head.prev.next = newNode;
        // head.prev = newNode;
        // head = newNode;

        // case 2 : if we have head and tail both

        Node8 newNode = new Node8(data);
        newNode.prev = tail;
        newNode.next = tail.next;
        tail.next.prev = newNode;
        newNode.next = head;
        head = newNode;
        tail.next = head;

        // case 3 : Same as all if we have tail only.
    }

    public void insertAFterGivenValue(int value, int data) {
        if (head.data == value) {
            insertAtPosition(2, data);
            return;
        }
        Node8 temp = head;
        do {
            temp = temp.next;
        } while (temp.data != value && temp.next != head);
        if (temp.data != value && temp.next == head) {
            System.out.println("Enter valid position,");
            return;
        }
        if (temp.next == head && temp.data == value) {
            insertAtEnd(data);
            return;
        }

        Node8 newNode = new Node8(data);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        System.out.println("inserted successufully.");
    }

    public static void main(String[] args) {

        linkedList8 obj = new linkedList8();
        obj.insertAtEnd(2);
        obj.insertAtEnd(4);
        obj.insertAtEnd(6);
        obj.insertAtEnd(8);
        obj.insertAtEnd(10);
        // obj.insertAtBeginning(2);
        // obj.insertAtBeginning(4);
        // obj.insertAtBeginning(45);
        // obj.insertAtBeginning(456);
        // obj.insertAtBeginning(4567);
        // obj.insertAtBeginning(45678);
        // obj.insertAtBeginning(456789);
        System.out.println();
        obj.traverseLinkedList();
        System.out.println();
        // obj.insertAFterGivenValue(88, 0);
        // obj.insertAtPosition(1,0);
        obj.traverseLinkedList();
        System.out.println();
        System.out.println(obj.tail.next.data);
        System.out.println(obj.head.prev.data);
    }
}
