public class App {
    public static void main(String[] args) throws Exception {
        Queue searchingQueue = new Queue();

        searchingQueue.insertAtHead(12);
        searchingQueue.insertAtHead(14);
        searchingQueue.insertAtHead(26);
        searchingQueue.insertAtHead(37);
        searchingQueue.insertAtHead(49);

        searchingQueue.searchQueue(26);
        
        if (searchingQueue.searchQueue(26) == -1) {
            System.out.println("Não tem");
        }else {
            System.out.println("Tá aqui, ó: " + searchingQueue.searchQueue(26));
        }

    }
}
