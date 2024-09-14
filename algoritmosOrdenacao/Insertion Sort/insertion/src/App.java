public class App {
    public static void main(String[] args) throws Exception {

        InsertionSort ins = new InsertionSort();

        int arr[] = { 12, 11, 13, 5, 6 };

        ins.sort(arr);

        ins.printArray(arr);

    }
}
