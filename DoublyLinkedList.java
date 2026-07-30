class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    Node head;

    // Insert at End
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at End
    void deleteEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
        temp.prev = null; // Optional: remove backward link
    }

    // Display Forward
    void displayForward() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display Backward
    void displayBackward() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();

        list.deleteEnd();

        System.out.println("After Delete at End:");
        list.displayForward();

        System.out.println("Backward After Deletion:");
        list.displayBackward();
    }
}
