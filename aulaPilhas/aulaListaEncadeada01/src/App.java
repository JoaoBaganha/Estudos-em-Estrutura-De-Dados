public class App {
    public static void main(String[] args) throws Exception {

        ListaEncadeada list = new ListaEncadeada();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        list.deleteByKey(6);
        list.deleteByPosition(3);
        System.out.println("Lista encadeada: ");
        list.printList();        
    }
}
