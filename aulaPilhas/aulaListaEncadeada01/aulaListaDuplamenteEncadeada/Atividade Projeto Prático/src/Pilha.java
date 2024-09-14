public class Pilha {
    
    Node head;
    Node tail;

    public Pilha() {
        this.head = null;
        this.tail = null;
    }

    public void push(Item data){
        Node temp = new Node(data);

        if(head == null){
            this.head = temp;
            this.tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            this.head = temp;
        }
    }

    public void traverse(){
        Node current = this.head;

        while(current != null){
            System.out.println(current.data + "");
            current = current.next;
        }
    }

    public void peek(){
        System.out.println(this.head.data);
    }

    public boolean isEmpty(){
        if(head == null){
            System.out.println("Pilha vazia!");
            return true;
        }else{
            System.out.println("Pilha não está vazia!");
            return false;
        }
    }

    public void pop(){
        if(head == null){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    

}
