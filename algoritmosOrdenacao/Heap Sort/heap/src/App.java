public class App {
    public static void main(String[] args) throws Exception {

        HeapSort hh = new HeapSort();

        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        System.out.println("Vetor Aleatório:");
        hh.print(arr);

        hh.heapsort(arr);

        System.out.println("Vetor Ordenado:");
        hh.print(arr);

        HeapSortString hs = new HeapSortString();
        String arr2[] = { "banana", "apple", "orange", "grape", "pineapple" };

        System.out.println("Vetor Aleatório:");
        hs.print(arr2);
        hs.heapSortString(arr2);

        System.out.println("Vetor ordenado:");
        hs.print(arr2);

    }

}
