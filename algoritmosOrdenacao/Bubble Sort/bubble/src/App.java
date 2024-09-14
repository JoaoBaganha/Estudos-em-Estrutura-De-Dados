public class App {
    public static void main(String[] args) throws Exception {

        BubbleSort bub = new BubbleSort();

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bub.bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        bub.printArray(arr, n);
    }
}
