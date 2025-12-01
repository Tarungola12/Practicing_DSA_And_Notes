class Node2 {
    Node2 prev;
    int data;
    Node2 next;

    public Node2(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

}

public class linkedList4 {
    Node2 head = null;// but not need to write this
    Node2 tail = null;// but not need to write this
    int size = 0;// but not need to write this

    public void insertAtBeginning(int data) {
        if (head == null) {
            Node2 newNode = new Node2(data);
            head = newNode;
            tail = head;
            System.out.println("This is your first node and it created successfully.");
            size++;
            return;
        }
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        System.out.println("Insert succesfully.");
        size++;

    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Your List Is Empty.");
            return;
        }

        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("End");

    }

    public void insertAtEnd(int data) {
        if (head == null) {
            Node2 newNode = new Node2(data);
            head = newNode;
            tail = head;
            System.out.println("This is your first node and it created successfully.");
            size++;
            return;
        }
        // When we have tail

        // Node newNode = new Node(data);
        // tail.next = newNode;
        // newNode.prev = tail;
        // tail = newNode;

        // when we does't have tail
        Node2 temp = head;
        Node2 newNode = new Node2(data);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    public void insertAtSpecificPosition(int position, int data) {
        if (position <= 0 || position > size) {
            System.out.println("Enter valid position");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        int i = 1;
        Node2 temp = head;
        while (temp != null && i < position) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("You Entered wrong positon");
            return;
        }
        Node2 newNode = new Node2(data);
        temp.prev.next = newNode;
        newNode.prev = temp.prev.next;
        newNode.next = temp;
        temp.prev = newNode;
        System.out.println("Successfully inserted ");
        size++;

    }

    public void insertAfterValue(int value, int data) {
        if (head == null) {
            System.out.println("Your list is empty.");
            insertAtBeginning(data);
        }
        Node2 temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("The value is not present in you list");
            return;
        }
        Node2 newNode = new Node2(data);
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        System.out.println("Inserted successfully.");
    }

    public void traverseLinkedListReverse() {
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        } else if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.prev;
        }
        System.out.print("End");

    }


    public static void main(String[] args) {
        // Doubly linkedList
        linkedList4 obj = new linkedList4();
        obj.insertAtBeginning(5);
        // obj.insertAtBeginning(10);
        // obj.insertAtBeginning(15);
        // obj.insertAtBeginning(20);
        // obj.insertAtBeginning(25);
        // obj.insertAtBeginning(30);
        // obj.insertAtBeginning(40);
        // obj.traverseLinkedList();
        // obj.insertAtEnd(10);
        // obj.insertAtEnd(15);
        // obj.insertAtEnd(20);
        // obj.insertAtEnd(25);
        // obj.insertAtEnd(30);
        // obj.traverseLinkedList();
        // obj.insertAtSpecificPosition(0, 0);
        // obj.traverseLinkedList();
        // obj.insertAtSpecificPosition(7, 0);
        // obj.insertAfterValue(222, 0);
        // obj.traverseLinkedList();
        // obj.traverseLinkedListReverse();
    }
}
