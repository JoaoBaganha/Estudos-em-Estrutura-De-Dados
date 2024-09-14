public class App {
    public static void main(String[] args) throws Exception {
        Queue firstQueue = new Queue();
        Queue secondQueue = new Queue();

        firstQueue.insertAtHead(1);
        firstQueue.insertAtHead(2);
        firstQueue.insertAtHead(3);
        firstQueue.insertAtHead(4);

        secondQueue.insertAtHead(3);
        secondQueue.insertAtHead(2);
        secondQueue.insertAtHead(1);
        secondQueue.insertAtHead(0);

        if (firstQueue.sumQueue() <= secondQueue.sumQueue()) {
            firstQueue.travelForward();

        } else {
            secondQueue.travelForward();

        }
    }
}
