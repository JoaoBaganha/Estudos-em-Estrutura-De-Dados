public class App {
    public static void main(String[] args) throws Exception {

        QuickSort qi = new QuickSort();
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        System.out.println("Vetor original:");
        qi.print(arr);

        qi.quickSort(arr, 0, n - 1);
        System.out.println("Vetor não Ordenado:");
        qi.print(arr);

        QuickSortString qs = new QuickSortString();
        String arr2[] = { "a", "w", "y", "f", "g" };

        System.out.println("Vetor original:");
        qs.print(arr2);
        qs.quickSort(arr2, 0, arr2.length - 1);

        System.out.println("Vetor ordenado:");
        qs.print(arr2);

    }
}
