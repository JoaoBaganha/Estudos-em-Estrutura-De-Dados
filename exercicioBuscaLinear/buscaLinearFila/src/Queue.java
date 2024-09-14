public class Queue {
    Node head;

    public void insertAtHead(int data){
        Node newNodeHead = new Node(data);

        if (head == null) {
            head = newNodeHead;

        } else {
            newNodeHead.next = head;
            head.previous = newNodeHead;
            head = newNodeHead;
        }

    }

    public void deleteAtHead(){
        if (head == null) {
            return;
        }

        Node headValueToBeDeleted = head;
        head = head.next;
        headValueToBeDeleted.next = null;

    }

    public void travelForward(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }

    public int searchQueue(int x){

        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return current.data;
            }
            current = current.next;
        }

        return -1;
    }




}
