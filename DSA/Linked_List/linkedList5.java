class Node3 {
    Node3 prev;
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class linkedList5 {
    Node3 head;
    Node3 tail;
    int size;

    public void insertAtBeginning(int data) {
        if (head == null) {
            System.out.println("You inserting the first element and we will creating a list");
            Node3 newNode = new Node3(data);
            head = newNode;
            System.out.println("Your Node is created");
            tail = head;
            size++;
            return;
        }
        Node3 newNode = new Node3(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }

    public void deletionFromBeginning() {
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("your list is empty and it is your last element which is deleted.");
            head = null;
            size--;
            return;
        }

        head = head.next;
        head.prev.next = null;
        head.prev = null;
        size--;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }
        if (head.next == null) {
            deletionFromBeginning();
            return;
        }
        // if we have tail then we can do is :

        // tail = tail.prev;
        // tail.next.prev = null;
        // tail.next = null;
        size--;
        // System.out.println("successfully deleted last element");

        // if we does not have tail then what we can do is :

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next.prev = null;
        temp.next = null;
        System.out.println("end element is deleted successfully.");
        size--;
    }

    // public void deleteFromSpecificPosition(int position) {
    // // when i stop temp before the value which would be deleted then the
    // following code is :
    // if (position <= 0) {// || position > size) {
    // System.out.println("Give valid positon");
    // return;
    // }
    // if (head == null) {
    // System.out.println("Your list is empty.");
    // return;
    // }
    // if (position == 1) {
    // deletionFromBeginning();
    // return;
    // }
    // Node temp = head;
    // int i = 1;
    // while (temp.next != null && i < position - 1) {
    // temp = temp.next;
    // i++;
    // }
    // if (temp.next == null) {
    // System.out.println("Enter valid poistion");
    // return;
    // }
    // if (temp.next.next == null) {
    // deleteFromEnd();
    // return;
    // }
    // Node newNode = temp.next;
    // temp.next = temp.next.next;
    // newNode.next.prev = temp;
    // newNode.prev = null;
    // newNode.next = null;
    // newNode = null;
    // System.out.println("Succesfully deleted.");
    // }

    /*
     * public void deleteByAnValue(int value) {
     * if (head == null) {
     * System.out.println("you list is empty");
     * return;
     * }
     * if (head.next == null) {
     * head = null;
     * return;
     * }
     * if (head.data == value) {
     * deletionFromBeginning();
     * return;
     * }
     * Node temp = head;
     * while (temp.next != null && temp.next.data != value) {
     * temp = temp.next;
     * }
     * 
     * if (temp.next == null) {
     * System.out.println("Enter valid Position.");
     * return;
     * }
     * Node newNode = temp.next;
     * temp.next = temp.next.next;
     * newNode.next.prev = temp;
     * newNode.prev = null;
     * newNode.next = null;
     * newNode = null;
     * System.out.println("Succesfully deleted.");
     * }
     */

    public void traverseLinkedListReverse() {
        if (head == null) {
            System.out.println("your list is empty.");
            return;
        }
        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println("End");

    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Your list is empty.");
            return;
        }
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void deleteFromSpecificPosition(int poistion) {
        // When i stop temp at where we want delete
        if (head == null) {
            System.out.println("Your list is empty.");
            return;
        }
        if (poistion == 1) {
            deletionFromBeginning();
            return;
        }
        Node3 temp = head;
        int i = 1;
        while (temp != null && i < poistion) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Give valid position.");
            return;
        }
        if (temp.next == null) {
            deleteFromEnd();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        temp = null;
        System.out.println("Succesfully deleted.");
    }

    // public void deleteFromSpecificPosition(int position){
    // // If we stop after then in last it cause null pointer exception becoz it
    // jump to last and if position is last then we have to handle it differently
    // }

    public void deleteByAnValue(int value) {
        // When i Stop at that which element would be deleted then the following code is
        // here :
        if (head == null) {
            System.out.println("Your list is empty.");
            return;
        }
        if (head.data == value) {
            deletionFromBeginning();
            return;
        }
        Node3 temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data is not present in the list.");
            return;
        }
        if (temp.next == null) {
            deleteFromEnd();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        temp = null;
        System.out.println("Succesfully deleted.");
    }

    
    public static void main(String[] args) {
        // Deletion in doubly linkedList
        linkedList5 obj = new linkedList5();
        obj.insertAtBeginning(25);
        obj.insertAtBeginning(20);
        obj.insertAtBeginning(15);
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(5);
        // obj.traverseLinkedList();
        // obj.deletionFromBeginning();
        // obj.traverseLinkedList();
        obj.traverseLinkedList();
        obj.deleteByAnValue(2222);
        // obj.deleteFromSpecificPosition(6);
        // obj.deleteByAnValue(25);
        obj.traverseLinkedList();

    }

}
