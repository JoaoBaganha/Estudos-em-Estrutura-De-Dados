public class App {
    public static void main(String args[]) {

        ShellSort ss = new ShellSort();
        int arr[] = { 12, 34, 54, 2, 3 };
        System.out.println("Vetor aleatório");
        ss.print(arr);

        ss.sort(arr);

        System.out.println("Vetor Ordenado");
        ss.print(arr);

        ShellSortString sss = new ShellSortString();
        String arr2[] = { "banana", "apple", "orange", "grape", "pineapple" };
        System.out.println("Array original:");
        sss.print(arr2);
        sss.shellSortString(arr2);
        System.out.println("Array ordenado:");
        sss.print(arr2);
    }
}
