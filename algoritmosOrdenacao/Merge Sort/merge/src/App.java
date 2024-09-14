public class App {
    public static void main(String args[]) {

        MergeSort m = new MergeSort();
        int arr[] = { 129, 11, 13, 5, 6, 7 };

        System.out.println("Vetor inicial");
        m.print(arr);

        m.mergesort(arr, 0, arr.length - 1);

        System.out.println("Vetor Ordenado");
        m.print(arr);

        // Utilizando o MergeSort pra ordenar String

        MergeSortString ms = new MergeSortString();
        String arr2[] = { "banana", "apple", "orange", "grape", "pineapple" };

        System.out.println("Vetor original:");
        ms.printString(arr2);

        ms.mergeSortString(arr2, 0, arr2.length - 1);

        System.out.println("Vetor ordenado:");
        ms.printString(arr2);
    }
}
