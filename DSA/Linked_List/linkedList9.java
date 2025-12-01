class Node9 {
    Node9 prev;
    int data;
    Node9 next;

    public Node9(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class linkedList9 {
    Node9 head;
    Node9 tail;
    int size;

    public void insertAtBeginning(int data) {
        if (head == null) {
            Node9 newNode = new Node9(data);
            head = newNode;
            tail = head;
            tail.next = head;
            head.prev = tail;
            newNode = null;
            return;
        }
        Node9 newNode = new Node9(data);
        newNode.prev = head.prev;
        head.prev.next = newNode;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        newNode = null;

    }

    public void deletionFromBeginning() {
        if (head == null) {
            System.out.println("chal be dalle ab band kr ");
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
            System.out.println("Traun sala madarchod bhadwa");
            return;
        }
        head.next.prev = head.prev;
        head.prev = null;
        head.next.prev.next = head.next;
        head = head.next;

    }

    public void deleteFormEnd() {
        if (head == null) {
            System.out.println("You list is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
            return;
        }
        Node9 temp = head;
        // case 1 : if we have head only
        tail = head.prev;
        tail.prev.next = tail.next;
        tail.next = null;
        tail = tail.prev;
        head.prev = tail;

    }

    public void deleteFromGivenPosition(int position) {
        if (position <= 0) {
            System.out.println("Enter wrong position");
            return;
        }
        if (head == null) {
            System.out.println("You list is empty.");
            return;
        }
        if (position == 1) {
            deletionFromBeginning();
            return;
        }
        int i = 1;
        Node9 temp = head;
        do {
            temp = temp.next;
            i++;
        } while (temp.next != head && i < position);
        if (temp.next == head && i != position) {
            System.out.println("Enter valid poisition.");
            return;
        }
        if (temp.next == head && i == position) {
            deleteFormEnd();
            return;
        }
        Node9 preNode = temp.prev;
        preNode.next = temp.next;
        temp.next = preNode;
        temp.next = null;
        temp.prev = null;
        temp = null;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("You list is empyt.");
            return;
        }
        Node9 temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("End");
    }

    public void deleteFromGivenValue(int value){
        if (head == null) {
            System.out.println("You list is empty.");
            return;
        }
        if(head.data == value){
            deletionFromBeginning();
            return ;
        }
        if(head.prev.data == value){
            deleteFormEnd();
            return ;
        }
        Node9 temp = head;
        do {
            temp = temp.next;
        } while (temp.data != value && temp.next != head);
        if(temp.data != value && temp.next == head){
            System.out.println("Enter valid Data.");
            return ;
        }
        Node9 preNode = temp.prev;
        preNode.next = temp.next;
        temp.next = preNode;
        temp.next = null;
        temp.prev = null;
        temp = null;

    }
    public static void main(String[] args) {
        linkedList9 obj = new linkedList9();
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(8);
        obj.insertAtBeginning(6);
        obj.insertAtBeginning(4);
        obj.insertAtBeginning(2);
        obj.traverseLinkedList();
        // obj.deleteFromGivenValue(1055);
        // obj.deleteFromGivenPosition(6);
        // obj.deletionFromBeginning();
        // obj.deleteFormEnd();
        // obj.deleteFormEnd();
        // obj.deleteFormEnd();
        // obj.deleteFormEnd();
        // obj.deleteFormEnd();
        // obj.deletionFromBeginning();
        // obj.deletionFromBeginning();
        // obj.deletionFromBeginning();
        // obj.deletionFromBeginning();
        obj.traverseLinkedList();
        System.out.println(obj.tail.next.data);
        System.out.println(obj.head.prev.data);

    }

}