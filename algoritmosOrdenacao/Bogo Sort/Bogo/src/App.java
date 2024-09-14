public class App {
    public static void main(String[] args) throws Exception {

        int[] a = { 3, 2, 5, 1, 0, 4 };
        BogoSort ob = new BogoSort();

        ob.bogoSort(a);

        System.out.print("Vetor Ordenado: ");
        ob.printArray(a);
    }
}
