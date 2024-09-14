public class ListaDuplamenteEncadeada {
    // Declaration of instance variables
    Node head; // Points to the first node in the list
    Node tail; // Points to the last node in the list

    // Method to insert a new node at the head of the list
    public void insertHead(int data){
        // Create a new node with the provided data
        Node newNodeHead = new Node(data);
        
        // If the list is empty, make the new node both the head and the tail
        if(head == null){
            head = newNodeHead;
            tail = newNodeHead;
        } else { // If the list is not empty
            // Adjust pointers to make the new node the new head
            newNodeHead.next = head;
            head.previous = newNodeHead;
            head = newNodeHead;
        }
    }

    // Method to insert a new node at the tail of the list
    public void insertTail(int data){
        // Create a new node with the provided data
        Node newNodeTail = new Node(data);
        
        // If the list is empty, make the new node both the head and the tail
        if(tail == null){
            head = newNodeTail;
            tail = newNodeTail;
        } else { // If the list is not empty
            // Adjust pointers to make the new node the new tail
            newNodeTail.previous = tail;
            tail.next = newNodeTail;
            tail = newNodeTail;
        }
    }

    // Method to traverse the list from head to tail and print each node's data
    public void travelForward(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }

    // Method to traverse the list from tail to head and print each node's data
    public void travelBackwards(){
        Node current = tail;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }

    public void deleteAtHead(){
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }

        Node headValueToBeDeleted = head;
        head = head.next;
        head.previous = null;
        headValueToBeDeleted.next = null;

    }

    public void deleteAtTail(){
        if (tail == null) {
            return;
        }

        if (tail == head) {
            tail = null;
            head = null;
            return;
        }

        Node tailValueToBeDeleted = head;
        tail = tail.previous;
        tail.next = null;
        tailValueToBeDeleted.previous = null;
    }

}
