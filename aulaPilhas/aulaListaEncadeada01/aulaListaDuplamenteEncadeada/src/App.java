public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada list = new ListaDuplamenteEncadeada();

        list.insertHead(0);
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);

        list.deleteAtHead();
        list.deleteAtTail();
        System.out.println("Lista inserção cabeça (começo): ");
        list.travelForward();

        System.out.println("Lista inserção cauda (final): ");
        list.travelBackwards();
    }
}
