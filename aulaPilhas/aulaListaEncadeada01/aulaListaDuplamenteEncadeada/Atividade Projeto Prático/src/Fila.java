public class Fila {
    
    Node head;
    Node tail;

    public Fila() {
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
        System.out.println(this.tail.data);
    }

    public boolean isEmpty(){
        if(head == null){
            System.out.println("Fila vazia!");
            return true;
        }else{
            System.out.println("Fila não está vazia!");
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

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    public int size(){
        int tam = 0;
        Node current = this.head;

        while(current != null){
            tam++;
            current = current.next;
        }
        return tam;
    }

    

}
