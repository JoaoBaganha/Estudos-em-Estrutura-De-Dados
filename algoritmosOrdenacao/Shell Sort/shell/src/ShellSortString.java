public class ShellSortString {

    public void shellSortString(String arr[]) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i += 1) {

                String temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
    }

    public void print(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
